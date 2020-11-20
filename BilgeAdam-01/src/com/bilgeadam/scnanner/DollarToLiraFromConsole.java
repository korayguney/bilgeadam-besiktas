package com.bilgeadam.scnanner;

import java.util.Scanner;

public class DollarToLiraFromConsole {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write dollar amount : ");
		
		double dollar = scanner.nextDouble();
		
		double lira = dollar * 7.62;
		
		System.out.println("Converted to Lira : " + lira + " TL");
		
	}

}
