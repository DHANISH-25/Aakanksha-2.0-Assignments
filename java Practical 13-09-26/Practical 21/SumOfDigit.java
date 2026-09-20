import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        while (num > 0) {
            int lastNum = num % 10;
            sum = sum + lastNum;
            num = num / 10;
        }

        System.out.println(sum);

        sc.close();

    }
}