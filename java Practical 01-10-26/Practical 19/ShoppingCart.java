
/*19\. Write a Java program to create a `ShoppingCart` class with methods to add product prices, calculate the total bill, and apply a discount.*/

class ShoppingCart{
    double total = 0;
    double discount = 0;
    void productPrices(double price){
        total += price;
    }

    void discount(){
        discount = total*20/100;
    }

    void totalBill(){
        double totalBill = total - discount;
        System.out.println("Your final price after applying 20% discount: " + totalBill);
    }

    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart();
        sc.productPrices(5000);
        sc.productPrices(500);
        sc.productPrices(550);

        sc.discount();
        sc.totalBill();
        
    }


}