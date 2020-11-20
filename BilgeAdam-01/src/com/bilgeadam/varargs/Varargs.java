package com.bilgeadam.varargs;

public class Varargs {

	public static void main(String[] args) {
		System.out.println(new Varargs().avarage(new double[] { 2, 4, 6, 8, 10, 34 }));
	}

	//variable argument list (varargs)
	public double avarage(double... numbers){
		double total = 0.0;
		for(double d: numbers){
			total += d;
		}
		return total/numbers.length;
	}


	
}
