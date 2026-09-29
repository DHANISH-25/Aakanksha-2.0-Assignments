/*20. Array-Based Electricity Bill Calculator Write a Java program to input the electricity units consumed by 10 customers into an array.

Calculate the bill for each customer using:

Units Rate

0–100 ₹2/unit
101–200 ₹3/unit
201–300 ₹5/unit
Above 300 ₹7/unit


For every customer, display:

Customer No. | Units | Bill | Category

Also display:

Highest bill

Lowest bill

Total revenue

Number of customers consuming more than 300 units */
import java.util.Scanner;

class ArrayBasedElectricity{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] units = new int[10];

        double bill, highest = 0, lowest = 0, total = 0;
        int count = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter units for Customer " + (i + 1) + ": ");
            units[i] = sc.nextInt();

            if (units[i] <= 100) {
                bill = units[i] * 2;
            }
            else if (units[i] <= 200) {
                bill = 100 * 2 + (units[i] - 100) * 3;
            }
            else if (units[i] <= 300) {
                bill = 100 * 2 + 100 * 3 + (units[i] - 200) * 5;
            }
            else {
                bill = 100 * 2 + 100 * 3 + 100 * 5
                     + (units[i] - 300) * 7;
                count++;
            }

            // First customer's bill
            if (i == 0) {
                highest = bill;
                lowest = bill;
            }

            if (bill > highest) {
                highest = bill;
            }

            if (bill < lowest) {
                lowest = bill;
            }

            total = total + bill;

            System.out.println("Customer " + (i + 1)
                    + "  Units: " + units[i]
                    + "  Bill: ₹" + bill);
        }

        System.out.println("\nHighest Bill = ₹" + highest);
        System.out.println("Lowest Bill = ₹" + lowest);
        System.out.println("Total Revenue = ₹" + total);
        System.out.println("Customers above 300 units = " + count);

        sc.close();
    }
}
