package com.demo;

/*7\. Electricity Bill Management: Create an `ElectricityBill` class with private data members (Consumer Number, Consumer Name, Units Consumed). Initialize details using a 
 * constructor and create a method to calculate the electricity bill based on the following rates: First 100 units – ₹2/unit, Next 100 units – ₹3/unit, Above 200 units – ₹5/unit. 
 * Add a fixed meter charge of ₹50 and display the final bill.*/

class ElectricityBill {
	private int consumerNumber;
	private String consumerName;
	private double unitConsume;
	private double totalBill;

	public ElectricityBill(int consumerNumber, String consumerName, double unitConsume) {
		this.consumerName = consumerName;
		this.consumerNumber = consumerNumber;
		this.unitConsume = unitConsume;
	}

	public void setConsumerNumber(int consumerNumber) {
		this.consumerNumber = consumerNumber;
	}

	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}

	public void setUnitConsume(double unitConsume) {
		this.unitConsume = unitConsume;
	}

	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}

	public int getConsumerNumber() {
		return consumerNumber;
	}

	public String getConsumerName() {
		return consumerName;
	}

	public double getUnitConsume() {
		return unitConsume;
	}

	public double getTotalBill() {
		return totalBill;
	}

	public void electricityBill() {

		if (unitConsume <= 100) {
			totalBill = unitConsume * 2;
		} else if (unitConsume <= 200) {
			totalBill = (100 * 2) + (unitConsume - 100) * 3;
		} else {
			totalBill = (100 * 2) + (100 * 3) + ((unitConsume - 200) * 5);
		}
		totalBill += 50;
	}

	public void display() {
		System.out.println("Consumer Number : " + consumerNumber);
		System.out.println("Consumer Name   : " + consumerName);
		System.out.println("Units Consumed  : " + unitConsume);
		System.out.println("Final Bill      : ₹" + totalBill);

	}
}

public class Main6 {
	public static void main(String[] args) {
		ElectricityBill ec = new ElectricityBill(22551478, "Dhanish KUmar", 250);
		ec.electricityBill();
		ec.display();
	}
}
