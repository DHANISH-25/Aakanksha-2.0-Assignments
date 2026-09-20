

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Unit consumption");
        double unit = sc.nextDouble();
        int pricePerUnit = 10;
        System.out.println("Electricity Price per Unit is: " + pricePerUnit);
        if (unit<100) {
            System.out.println("Your Elcetricity Bill is: " + 5 * unit);
        } else if(unit<200){
            System.out.println("Your Elcetricity Bill: " + 8 * unit);
        }else if(unit > 200){
            System.out.println("Your Elcetricity Bill: " + pricePerUnit * unit);
        }

        sc.close();

    }
}
