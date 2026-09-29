package com.langfundamentals.methods;

public class Bank {
	
	double balance=10000;
	
	void checkBalance() {
		System.out.println("The current Balance is:" + balance);
	}
	
	void deposit(double amount) {
		System.out.println("Deposit amount is:" + amount);
		balance=balance + amount;
	}

	public static void main(String[] args) {
		System.out.println("Main method Started");
		
		Bank sbi=new Bank();
		sbi.checkBalance();
		sbi.deposit(5000);
		sbi.withdraw(10000);
	}
	void withdraw(double amount) {
		System.out.println("Withdraw amount is amount:"+ amount);
		balance=balance - amount;
		checkBalance();
	}

}
