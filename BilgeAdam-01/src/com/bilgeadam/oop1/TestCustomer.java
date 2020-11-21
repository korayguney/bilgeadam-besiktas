package com.bilgeadam.oop1;

public class TestCustomer {

	public static void main(String[] args) {
		BankCustomer customer1 = new BankCustomer(); //object
		customer1.setFirstName("Koray");
		customer1.setLastName("Guney");
		customer1.setAccountNumber(1111111111111L);
		customer1.setBalance(100);
		customer1.setMail("kg@gmail.com");
		
		//customer1.deposit(100);
		customer1.withDraw(150);
		
	}

}
