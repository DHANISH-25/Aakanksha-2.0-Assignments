package com.demo;

/*10\. Mobile Recharge Management System: Create a `MobileRecharge` class with private data members (Mobile Number, Customer Name, Current Balance). 
 * Initialize details using a constructor and implement methods to recharge the mobile balance, make calls, and check the remaining balance. 
 * Assume the call charge is ₹1 per minute and prevent calls when the balance is insufficient.*/
class MobileRecharge {

	private long number;
	private String name;
	private double balance;

	public MobileRecharge(long number, String name, double balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void rechargeBalance(double amount) {
		balance += amount;
		System.out.println("Recharge sucessfull.");
		System.out.println("Updated Balance: " + balance);
	}

	public void makeCall(int minutes) {
		double callCharge = minutes * 1;

		if (balance >= callCharge) {
			balance -= callCharge;
			System.out.println("Call duration: " + minutes);
			System.out.println("Remaining balance: " + balance);
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	public void checkBalance() {
		System.out.println("\n");
		System.out.println("Mobile Number : " + number);
		System.out.println("Customer Name : " + name);
		System.out.println("Current Balance : ₹" + balance);

	}

}

public class Main9 {
	public static void main(String[] args) {
		MobileRecharge mr = new MobileRecharge(7903349662L, "Dhanish Kumar", 50.00);

		mr.checkBalance();
		mr.makeCall(10);
		mr.rechargeBalance(20);
		mr.makeCall(15);
		mr.checkBalance();
	}

}
