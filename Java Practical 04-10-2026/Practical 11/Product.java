public class Product {
    String name;
    double price;
    int quantity;

    Product(String n, double p, int q) {
        name = n;
        price = p;
        quantity = q;
    }

    void totalPrice() {
        Double finalPrice = price * quantity;
        System.out.println("Product name: " + name);
        System.out.println("Price of your product: " + price);
        System.out.println("Quantity of product: " + quantity);
        System.out.println("Your total Bill: " + finalPrice);
    }

    public static void main(String[] args) {
        Product prd = new Product("Table",1899,6);
        prd.totalPrice();
    }
}

