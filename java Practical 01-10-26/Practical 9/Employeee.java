import java.util.Scanner;

public class Employeee {

    public void grossSalary(double hra, double da, double basic) {
        double gross = hra + da + basic;
        System.out.println("Your Gross Salary is: " + gross);
    }

    public static void main(String[] args) {
        Employeee obj = new Employeee();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your basic salary: ");
        double basic = sc.nextDouble();

        double hra = (basic / 25) * 100;
        double da = (basic / 30) * 100;

        obj.grossSalary(basic, hra, da);

        sc.close();
    }

}
