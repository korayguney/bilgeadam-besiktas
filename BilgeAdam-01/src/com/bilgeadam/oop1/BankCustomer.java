package com.bilgeadam.oop1;

public class BankCustomer {
//account number, balance, customer name, email and phone number
	private long accountNumber;
	private double balance;
	private String firstName;
	private String lastName;
	private String mail;
	private String telNo;
	
	public void deposit(double depositAmount) {
		balance += depositAmount;
		System.out.println("The new balance : " + balance);
	}
	
	public void withDraw(double witdrawAmount) {
		
		if(balance >= witdrawAmount) {
			balance -= witdrawAmount;
			System.out.println("The remained balance : " + balance);
		} else {
			System.out.println("There is no enough balance");
		}
	}

	//getter & setter
	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	
	/*
	// getter
	public double getBalance() {
		return this.balance;
	}
	
	// setter
	public void setBalance(double balance) {
		this.balance = balance;
	}
	*/
	
	
	
}
