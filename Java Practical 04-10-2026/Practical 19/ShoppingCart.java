/*19\. Create a `ShoppingCart` class with product name, price, and quantity. Initialize the product details using a constructor and create methods to 
calculate the total price, apply a discount, and display the final bill. */
public class ShoppingCart {
    String name;
    double price;
    int quantity;
    double total;
    double discount;

    ShoppingCart(String n, double p, int q) {
        name = n;
        price = p;
        quantity = q;
    }


    void totalPrice(){
        total = price * quantity;
        System.out.println("Total price: " + total);
    }

        void discount(){
        discount = total * 20/100;
        System.out.println("Discount: " + discount);
    }

        void finalBill() {
        double finalBill = total - discount;
        System.out.println("Product: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Final price after 20% discount: " + finalBill);
    }

    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart("Java", 560.00, 2);
        sc.totalPrice();
        sc.discount();
        sc.finalBill();
    }
}
