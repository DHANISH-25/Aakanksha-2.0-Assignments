public class Laptop {
    String brand;
    String processor;
    String ram;
    String storage;
    double price;

    Laptop(String b, String p) {
        brand = b;
        processor = p;
        ram = "5 GB";
        
    }

    Laptop(String b, String p, String r) {
        brand = b;
        processor = p;
        ram = r;
    }

    Laptop(String b, String p, String r, String s, double pr) {
        brand = b;
        processor = p;
        ram = r;
        storage = s;
        price = pr;
    }

    void display() {
        System.out.println("Laptop Brand: " + brand);
        System.out.println("Laptop processor: " + processor);
        System.out.println("Laptop ram: " + ram);
        System.out.println("Laptop storage: " + storage);
        System.out.println("Laptop price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Laptop lp = new Laptop("HP", "Inten i3");
        Laptop lp1 = new Laptop("Dell", "Intel i7", "8 GB");
        Laptop lp2 = new Laptop("DELL", "Ryzen 7", "32 GB", "LPDDR5", 89000.00);

        lp.display();
        lp1.display();
        lp2.display();
    }
}
