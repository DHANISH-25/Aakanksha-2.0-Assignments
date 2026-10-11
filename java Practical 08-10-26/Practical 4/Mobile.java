public class Mobile {
    String brand;
    String model;
    double price;

    Mobile(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    void display() {
        System.out.println("Mobile brand: " + brand);
        System.out.println("Mobile model: " + model);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Mobile mb = new Mobile("Micromax", "Q461", 15999);
        Mobile mb1 = new Mobile("Micromax", "Q462", 14999);
        Mobile mb2 = new Mobile("Micromax", "Q463", 19999);

        mb.display();
        mb1.display();
        mb2.display();
    }
}
