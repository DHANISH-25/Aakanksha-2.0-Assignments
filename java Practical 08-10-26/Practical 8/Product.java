public class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    Product(int pi, String pn) {
        productId = pi;
        productName = pn;
    }

    Product(int pi, String pn, double p) {
        productId = pi;
        productName = pn;
        price = p;
    }

    Product(int pi, String pn, double p, int q) {
        productId = pi;
        productName = pn;
        price = p;
        quantity = q;
    }

    void display() {
        System.out.println("Product id: " + productId);
        System.out.println("Product name: " + productName);
        System.out.println("Product price: " + price);
        System.out.println("Product quantity: " + quantity);
        System.out.println();
    }

    public static void main(String[] args) {
        Product pd = new Product(6589, "Table");
        Product pd1 = new Product(6589, "Table", 589.00);
        Product pd2 = new Product(6589, "Table", 589.00, 2);

        pd.display();
        pd1.display();
        pd2.display();
    }

}
