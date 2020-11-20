package com.bilgeadam.shorthand;

public class ShortHandOperator {
	public static void main(String[] args) {
		int x = 2; 
		int y = ++x;//x++;
		int z = --x;
		
		System.out.println("x : " + x); // 2
		System.out.println("y : " + y); // 2 & 3
		System.out.println("z : " + z); // 2 & 3
		System.out.println("x : " + x); // 2
		
		
	}
}
