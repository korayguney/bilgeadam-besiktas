package com.bilgeadam.bmi;

import javax.swing.JOptionPane;

public class BmiCalculatorWithSwing {

	public static void main(String[] args) {
		String st_height = JOptionPane.showInputDialog("Write your height (m.):");
		double height = Double.valueOf(st_height);
		
		String st_weight = JOptionPane.showInputDialog("Write your weight (kg.):");
		double weight = Double.valueOf(st_weight);
		
		double bmiResult = weight / Math.pow(height, 2);
		
		if(bmiResult < 18.5) {
			JOptionPane.showInternalMessageDialog(null, "You are underweight");
		} else if(bmiResult >= 18.5 && bmiResult < 24.9) {
			JOptionPane.showInternalMessageDialog(null, "You are normal");
		}else if(bmiResult >= 25.0 && bmiResult < 30.0) {
			JOptionPane.showInternalMessageDialog(null, "You are overweight");
		}else if(bmiResult >= 30.0) {
			JOptionPane.showInternalMessageDialog(null, "You are very overweight");
		}
		
	}

}
