package com.bilgeadam.switchexp;

public class SwitchTest {
	public static void main(String[] args) {

		String string = "";
		int i = 22;
		
		switch (i) {
			case 1:
				string = "foo";
				break;
			case 2:
				string = "bar";
				break;
			default:
				string = "default";
				break;
		}
		System.out.println(string);

	}
}
