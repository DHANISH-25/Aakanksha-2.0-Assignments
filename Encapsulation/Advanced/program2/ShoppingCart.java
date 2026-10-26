public class ShoppingCart {
    private double itemPrice;
    private int quantity;
    private double total;

    public ShoppingCart(double itemPrice, int quantity) {
        setItemPrice(itemPrice);
        setQuantity(quantity);
        calculateTotal();
    }

    public void setItemPrice(double itemPrice) {
        if (itemPrice > 0) {
            this.itemPrice = itemPrice;
        } else {
            System.out.println("Invalid Item Price!");
        }
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Invalid Quantity!");
        }
    }


    public double getItemPrice() {
        return itemPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return total;
    }

    public void calculateTotal() {
        total = itemPrice * quantity;
    }

    public void display() {
        System.out.println("Item Price: " + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + total);
    }

    public static void main(String[] args) {

        ShoppingCart c1 = new ShoppingCart(500, 2);
        ShoppingCart c2 = new ShoppingCart(-100, 3);

        c1.display();
        System.out.println();

        c2.display();
    }
}