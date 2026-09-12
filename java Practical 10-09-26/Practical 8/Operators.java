
//8. Write a Java program to accept two integers and demonstrate the result of all relational operators and logical operators between them.
import java.util.Scanner;

class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number for caculating all the operators between them: ");
        int num1 = sc.nextInt();
        System.out.println("Enter first number for caculating all the operators between them: ");
        int num2 = sc.nextInt();

        System.out.println("Relational Operators Outputs");
        //Relational Operators
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 < num2: " + (num1 < num2));
        System.out.println("num1 >= num2: " + (num1 >= num2));
        System.out.println("num1 <= num2: " + (num1 <= num2));
        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 != num2: " + (num1 != num2)); 

        System.out.println("____________________________________");
        System.out.println("Logical Operators Outputs");

        //Logical Operators
        System.out.println("num1 < num2 && num1 > num2: " + (num1 < num2 && num1 > num2));
        System.out.println("num1 > num2 || num1 < num2: " + (num1 > num2 || num1 < num2));
        System.out.println("!(num1 > num2): " + (!(num1 > num2))); 

        sc.close();
    }
}