
import java.util.Scanner;

public class CheckNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check it is positive, negative or zero: ");
        int number = sc.nextInt();

        if (number > 0) 
            System.out.println(number + " is a positive number");
         else 
            if (number == 0) 
                System.out.println("You are entered zero number");
             else 
                System.out.println("it is a negative number");

             
        sc.close();

    }
}