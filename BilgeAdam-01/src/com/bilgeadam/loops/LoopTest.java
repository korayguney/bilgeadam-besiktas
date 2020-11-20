package com.bilgeadam.loops;

public class LoopTest {
	public static void main(String[] args) {
		//testWithWhile();
		testWithDoWhile();
		
		
	}
	
	public static void testWithWhile() {
		int a = 0;
		int i = 0;
		
		while(i<=100) {
			a += i;
			i++;
			System.out.println("Inside while loop");
		}
		
		System.out.println("Sum =" + a);
	}
	
	
	public static void testWithDoWhile() {
		int a = 0;
		int i = 1000;
		
		do {
			a += i;
			i++;
			System.out.println("Inside do side of loop");
		} while(i<=100);
		
		System.out.println("Sum =" + a);
	}
	
}
