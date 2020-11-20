package com.bilgeadam.bmi;

import java.util.Scanner;

public class BmiCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Write your height (m.):");
		double height = scanner.nextDouble();
		
		System.out.println("Write your weight (kg.):");
		double weight = scanner.nextDouble();
		
		double bmiResult = weight / Math.sqrt(height);
		
		if(bmiResult < 18.5) {
			System.out.println("You are underweight");
		} else if(bmiResult >= 18.5 && bmiResult < 24.9) {
			System.out.println("You are normal");
		}else if(bmiResult >= 25.0 && bmiResult < 30.0) {
			System.out.println("You are overweight");
		}else if(bmiResult >= 30.0) {
			System.out.println("You are very overweight");
		}
		
		
	}

}
