package com.bilgeadam.metroexample;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MetroWithGUI {

	private static double bakiye = 0.0;

	public static void main(String[] args) {
		int secim = 0;

		do {

			String str_secim = JOptionPane
					.showInputDialog("1- Kart bakiyemi göster\r\n" + "			2- Kartıma para yükle\r\n"
							+ "			3- Metroya bin\r\n" + "			4- Sistemden çıkış");

			secim = Integer.valueOf(str_secim);

			switch (secim) {
			case 1:
				bakiyeGoster();
				break;
			case 2:
				paraYukle();
				break;
			case 3:
				metroyaBin();
				break;
			case 4:
				sistemdenCik();
				break;
			default:
				break;
			}

		} while (secim != 4);

	}

	private static void sistemdenCik() {
		JOptionPane.showMessageDialog(null,"Güle güle");
		System.exit(0);
	}

	private static void metroyaBin() {

		String str_secim = JOptionPane
				.showInputDialog("Abone durumunu seçiniz: \n\t1- Tam bilet \n\t2-İndirimli Bilet");
		int aboneSecim = Integer.valueOf(str_secim);

		if (aboneSecim == 1) {
			bakiye -= 3.50;
			JOptionPane.showMessageDialog(null,
					"Tam bilet, Metroya hoşgeldiniz!\nKalan bakiyeniz : " + bakiye + " TL.");
		} else if (aboneSecim == 2) {
			bakiye -= 1.70;
			JOptionPane.showMessageDialog(null,
					"İndirimli bilet, Metroya hoşgeldiniz!\nKalan bakiyeniz : " + bakiye + " TL.");
		} else {
			JOptionPane.showMessageDialog(null, "Hatalı seçim");
			metroyaBin();
		}

	}

	private static void paraYukle() {
		String miktar = JOptionPane.showInputDialog("Yüklemek istediğiniz miktarı giriniz: ");
		bakiye += Double.valueOf(miktar);
		bakiyeGoster();
	}

	private static void bakiyeGoster() {
		JOptionPane.showMessageDialog(null, "Bakiyeniz :" + bakiye + " TL.");
	}

}
