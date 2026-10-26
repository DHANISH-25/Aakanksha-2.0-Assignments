public class Product {
    private double discount;

    // Constructor
    public Product(double discount) {
        setDiscount(discount);
    }

    // Setter
    public void setDiscount(double discount) {
        if (discount >= 0 && discount <= 50) {
            this.discount = discount;
        } else {
            System.out.println("Discount must be between 0% and 50%.");
        }
    }

    // Getter
    public double getDiscount() {
        return discount;
    }

    // Display method
    public void display() {
        System.out.println("Discount: " + discount + "%");
    }

    public static void main(String[] args) {

        Product p1 = new Product(25);
        Product p2 = new Product(60);

        p1.display();
        p2.display();
    }
}