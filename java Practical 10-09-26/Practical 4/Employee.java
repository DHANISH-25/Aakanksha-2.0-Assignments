//4. Write a Java program to accept the basic salary, HRA percentage, and DA percentage of an employee and calculate the gross salary using arithmetic and assignment operators.
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter Your Salary: ");
        double salary = get.nextDouble();
        System.out.println("Enter HRA percentage only number doesn't include %: ");
        double hraInput = get.nextDouble();
        System.out.println("Enter DA percentage only number doesn't include %: ");
        double daInput = get.nextDouble();
        double hra = salary * hraInput/100;
        double da = salary * daInput/100;
        double gross = salary + hra + da;
        System.out.println("Your Gross Salary is: "+ gross);
        
        get.close();
    }
}
