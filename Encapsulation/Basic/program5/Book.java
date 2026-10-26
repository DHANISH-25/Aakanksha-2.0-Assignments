public class Book {
    private double price;

    
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
            System.out.println("Valid Price.");
        } else {
            System.out.println("Invalid Price! Price must be greater than 0.");
        }
    }


    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Book b = new Book();

        b.setPrice(500);
        System.out.println("Price: " + b.getPrice());

        b.setPrice(-100);
        System.out.println("Price: " + b.getPrice());
    }
}