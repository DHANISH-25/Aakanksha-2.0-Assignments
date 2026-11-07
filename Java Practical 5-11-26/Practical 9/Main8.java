package com.demo;
/*9\. Shopping Cart Management: Create a `ShoppingCart` class with private data members (Product Name, Product Price, Quantity). Initialize details using a constructor 
 * and implement methods to add products, update quantities, and calculate the total cart amount. Apply a 5% discount if the total exceeds ₹2,000 and a 10% discount if it exceeds ₹5,000.*/

class ShoppingCart{
	private String productName;
	private double productPrice;
	private int quantity;
	private double totalAmount;
	
	public ShoppingCart(String productName, double productPrice, int quantity) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.quantity = quantity;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public double getTotalAmount() {
		return totalAmount;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void addProduct(String productName, double productPrice, int quantity) {
		this.productName=productName;
		this.productPrice=productPrice;
		this.quantity=quantity;
		System.out.println("Product added.");
	}
	
	public void updateQuantity(int quantity) {
		this.quantity=quantity;
		System.out.println("Quantity updated.");
	}
	
	public void calculateTotal() {
		
		totalAmount = productPrice * quantity;
		
		if(totalAmount > 5000) {
			totalAmount = totalAmount - (totalAmount *0.10);
			 System.out.println("10% Discount Applied.");
		}else if (totalAmount > 2000) {
            totalAmount = totalAmount - (totalAmount * 0.05);
            System.out.println("5% Discount Applied.");
        }
        else {
            System.out.println("No Discount Applied.");
        }
	}
	
	public void display() {
		System.out.println("");
        System.out.println("Product Name  : " + productName);
        System.out.println("Product Price : ₹" + productPrice);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Total Amount  : ₹" + totalAmount);
    }
	
	
}
public class Main8 {
	public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart("Laptop", 2500, 3);

        // Calculate total
        cart.calculateTotal();
        cart.display();

        // Update quantity
        cart.updateQuantity(1);
        cart.calculateTotal();
        cart.display();

        // Add another product
        cart.addProduct("Mobile", 6000, 1);
        cart.calculateTotal();
        cart.display();
    }

}
