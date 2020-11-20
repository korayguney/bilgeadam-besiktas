package com.bilgeadam.metroexample;

import java.util.Scanner;

public class Metro {

	private static Scanner scanner = new Scanner(System.in);
	private static double bakiye = 0.0;

	public static void main(String[] args) {
		int secim = 0;
		
		do {
			System.out.println("1- Kart bakiyemi göster");
			System.out.println("2- Kartıma para yükle");
			System.out.println("3- Metroya bin");
			System.out.println("4- Sistemden çıkış");
			
			secim = scanner.nextInt();
			
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
		System.out.println("Güle güle");
		System.exit(0);
	}

	public static void metroyaBin() {
		System.out.println("Abone durumunu seçiniz: \n\t1- Tam bilet \n\t2-İndirimli Bilet");
		int aboneSecim = scanner.nextInt();
		
		if(aboneSecim == 1) {
			System.out.println("Tam bilet, Metroya hoşgeldiniz!");
			bakiye -= 3.50;
			System.out.println("Kalan bakiyeniz : " + bakiye + " TL.");
		} else if(aboneSecim == 2) {
			System.out.println("İndirimli bilet, Metroya hoşgeldiniz!");
			bakiye -= 1.70;
			System.out.println("Kalan bakiyeniz : " + bakiye + " TL.");
		} else {
			System.out.println("Hatalı seçim");
			metroyaBin();
		}
		
	}

	public static void paraYukle() {
		System.out.println("Yüklemek istediğiniz miktarı giriniz: ");
		bakiye += scanner.nextDouble();
		bakiyeGoster();
	}

	private static void bakiyeGoster() {
		
		System.out.println("Bakiyeniz :" + bakiye + " TL.");
			
	}
	
	
	
	
	
	
}
