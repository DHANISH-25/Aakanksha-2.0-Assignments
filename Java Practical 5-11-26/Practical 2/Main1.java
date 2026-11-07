package com.demo;

class BankAccount{
	private int accountNumber;
	private String holderName;
	private double balance;
	
	public BankAccount(int accountNumber, String holderName, double balance) {
		this.accountNumber=accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	public void setAccountNumber(int accountNumber) {
		setAccountNumber(accountNumber);
	}
	
	public void setHolderName(String holderName) {
		setHolderName(holderName);
	}
	
	public void setBalance(double balance) {
		setBalance(balance);
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getHolderName() {
		return holderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	//deposit
	
	public void deposit(double value) {
		if(value > 0) {
			balance += value;
			System.out.println("Your Deposited money is: " + value);
			System.out.println("Your current balance: " + getBalance());
		}else {
			System.out.println("You are depositing zero. Please deposit greater than zero");
		}
	}
	
	//withdraw
	public void withdraw(double value) {
		if(value <= 0) {
			System.out.println("You Can't be able to withdraw money less than or equal to zero");
		}else if(value > balance) {
			System.out.println("Insufficient Balance");
		}else {
			balance -= value;
			System.out.println("Your Withdrawal money is: " + value);
			System.out.println("Your current balance: " + getBalance());
		}
	}
	
	//check balance
	public void checkBalance() {
		System.out.println("Your current balance is: " + getBalance());
	}
}
public class Main1 {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount(22556688, "Dhanish Kumar", 54555);
		ba.deposit(4000);
		ba.withdraw(2500);
		ba.checkBalance();
	}
}
