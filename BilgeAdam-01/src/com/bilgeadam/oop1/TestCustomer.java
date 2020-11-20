package com.bilgeadam.oop1;

public class TestCustomer {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setFirstName("Koray");
		customer1.setLastName("Guney");
		customer1.setAccountNumber(1111111111111L);
		customer1.setBalance(100);
		
		//customer1.deposit(100);
		customer1.withDraw(200);
		
	}

}
