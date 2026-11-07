package com.demo;
import java.util.Scanner;

class ATM{
	private int accountNumber;
	private int pin;
	private double balance;
	
	public ATM(int accountNumber, int pin, double balance) {
		this.accountNumber=accountNumber;
		this.pin=pin;
		this.balance=balance;
	}
	
	//getter setter 
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public int getPin() {
		return pin;
	}
	
	public double getBalance() {
		return balance;
	}
	
	//verify ATM Pin
	int enteredPin;
	int attempts = 0;
	public void atmPinCheck(int enteredPin) {

	    if(attempts >= 3) {
	        System.out.println("ATM Blocked. Maximum attempts exceeded.");
	        return;
	    }

	    if(getPin() == enteredPin) {
	        System.out.println("Your PIN is correct.");
	        attempts = 0;
	    }
	    else {
	        attempts++;
	        System.out.println("Wrong PIN.");

	        if(attempts == 3) {
	            System.out.println("ATM Blocked.");
	        }
	        else {
	            System.out.println("Attempts Left: " + (3 - attempts));
	        }
	    }
	}
	
	//check balance
	public void checkBalance() {
		System.out.println("Your current balance is: " + getBalance());
	}
	
	//Deposit balance
	public void deposit(double amount) {
        if (amount > 0) {
        	setBalance(getBalance() + amount);
            System.out.println("Deposit Amount: " + amount);
            System.out.println("New Balance: " + getBalance());
        } else {
            System.out.println("Deposited amount should be greater than 0");
        }
    }
	
	//withdraw balance
	
	public void withdrwa(double amount) {
		if(amount<=0) {
			System.out.println("You can't withdraw amount zero or less than zero");
		}else if(amount > getBalance()) {
			System.out.println("Insuficient Balance.");
		}else {
			setBalance(getBalance() - amount);
			System.out.println("Withdrawal balance: " + amount);
            System.out.println("New Balance: " + getBalance());
		}
	}
	
	//Change ATM pin
	public void changePin(int oldPin, int newPin) {
	    if(getPin() == oldPin) {
	        setPin(newPin);
	        System.out.println("PIN Changed Successfully");
	    }
	    else {
	        System.out.println("Incorrect Old PIN");
	    }
	}
}

public class Main5 {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

	    ATM atm = new ATM(1112223330, 1234, 45000);

	    while (atm.attempts < 3) {

	        System.out.print("Enter your ATM PIN: ");
	        int enteredPin = sc.nextInt();

	        atm.atmPinCheck(enteredPin);

	        if (atm.getPin() == enteredPin) {
	            break;
	        }
	    }
	    
	    atm.deposit(5000);
	    atm.withdrwa(1000);

	    sc.close();
	}
}
