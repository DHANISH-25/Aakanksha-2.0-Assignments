package com.demo;

/*5\. Product Price Management: Create a `Product` class with private data members (Product ID, Product Name, Price, Quantity). Initialize details using a constructor, implement getter 
 * and setter methods, and create methods to calculate total product value and update quantity. Apply a 10% discount if the total purchase value exceeds ₹5,000.*/

class Product {
	private int productId;
	private String name;
	private double price;
	private int quantity;

	public Product(int productId, String name, double price, int quantity) {
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public void setProductId(int productId) {
		setProductId(productId);
	}

	public void setName(String name) {
		setName(name);
	}

	public void setPrice(double price) {
		setPrice(price);
	}

	public void setQuantity(int quantity) {
		setQuantity(quantity);
	}

	public int getProductId() {
		return productId;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void updateQuantity(int newQuantity) {
		quantity = newQuantity;
		System.out.println("Quantity updated to: " + newQuantity);
	}

	public double totalValue() {
		double total = quantity * price;
		
		if(price > 5000) {
			System.out.println("Congratulations.. You are eligible for 10% discount.");
			total = total - (total*0.1);
		}
		return total;
	}
	
	public void display() {
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + name);
        System.out.println("Price        : ₹" + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Total Value  : ₹" + totalValue());
    }
}

public class Main4 {
	public static void main(String[] args) {
		Product pd = new Product(2211, "Chair", 450, 4);
		pd.totalValue();
		pd.display();
		pd.updateQuantity(2);
	}

}
