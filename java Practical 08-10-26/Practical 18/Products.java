/*18. Create a `Product` class with `productId`, `name`, `price`, `discount`, and `quantity`, and use **constructor overloading and constructor 
chaining** to initialize different product objects. Create methods to calculate the discount amount, final price, and total bill amount.*/

public class Products {
    int productId;
    String name;
    double price;
    double discount;
    int quantity;

    Products() {
        this(101, "Pen", 20.0, 10.0, 1);
    }

    Products(int id, String n, double p) {
        this(id, n, p, 0.0, 1);
    }

    Products(int id, String n, double p, double d) {
        this(id, n, p, d, 1);
    }

    Products(int id, String n, double p, double d, int q) {
        productId = id;
        name = n;
        price = p;
        discount = d;
        quantity = q;
    }

    double calculateDiscount() {
        return price * discount / 100;
    }

    double calculateFinalPrice() {
        return price - calculateDiscount();
    }

    double calculateTotalBill() {
        return calculateFinalPrice() * quantity;
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount Amount: " + calculateDiscount());
        System.out.println("Final Price: " + calculateFinalPrice());
        System.out.println("Total Bill: " + calculateTotalBill());
        System.out.println();
    }

    public static void main(String[] args) {
        Products p1 = new Products();
        Products p2 = new Products(102, "Book", 200.0);
        Products p3 = new Products(103, "Bag", 1000.0, 15.0);
        Products p4 = new Products(104, "Shoes", 2000.0, 20.0, 2);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }

}