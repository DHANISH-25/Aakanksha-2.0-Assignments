/*12\. Write a Java program to create a `Product` class with methods to calculate discount and final selling price.*/

class Product{
    double productPrice = 115;
    double discountAmount;
    double finalPrice;

    void discount(){
        discountAmount = productPrice * 20.0/100;
        System.out.println("Your discount: " + discountAmount);
    }

    void sellingPrice(){
        finalPrice = productPrice - discountAmount;
        
        System.out.println("The Final Price after discount: " + finalPrice);
    }

    public static void main(String[] args) {
      Product obj = new Product();
      System.out.println("Your product price is: " + obj.productPrice);
      obj.discount();
      obj.sellingPrice();
    }
}