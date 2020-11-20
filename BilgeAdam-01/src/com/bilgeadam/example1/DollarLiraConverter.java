package com.bilgeadam.example1;

public class DollarLiraConverter {

	public static double dollar = 250.45;
	public static double turkish_lira = 0;

	public static void main(String[] args) {

		turkish_lira = dollar * 7.62;

		System.out.println(dollar + " Dollar is equal to " + turkish_lira);
		System.out.printf("%f Dollar is equal to %f", dollar,  turkish_lira);

	}

}
