import java.util.Scanner;

public class NumberCountSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers for get your all numbers sum (enter 0 for exit): ");
        int num = sc.nextInt();

        int sum = 0;
        int count = 0;

        while (num != 0) {
            sum = sum + num;
            count++;

            num = sc.nextInt();
        }

        System.out.println("Total sum: " + sum);
        System.out.println("Total numbers you entered: " + count);

        sc.close();
    }
}
