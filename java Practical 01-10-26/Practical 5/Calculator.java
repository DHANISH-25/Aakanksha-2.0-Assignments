import java.util.Scanner;

public class Calculator {

    public double addition(double num1, double num2) {
        return num1 + num2;
    }

    public double substraction(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("----- MENU -----");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Choose an option to perfom that task (1,2,3,4): ");
        int option = sc.nextInt();

        System.out.println("Enter First Number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter Second Number: ");
        double num2 = sc.nextDouble();

        switch (option) {
            case 1:
                System.out.println("Addition: " + obj.addition(num1, num2));
                break;
            case 2:
                System.out.println("Substraction: " + obj.substraction(num1, num2));
                break;
            case 3:
                System.out.println("Multiplication: " + obj.multiplication(num1, num2));
                break;
            case 4:
                System.out.println("Division: " + obj.division(num1, num2));
                break;
            default:
                System.out.println("Please Enter Valid input....");
                break;
        }
        sc.close();

    }
}
