import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversed = 0;

        while (num > 0) {
            int num1 = num % 10;
            reversed = reversed * 10 + num1;
            num = num / 10;
            
        }

        System.out.println(reversed);
        sc.close();

    }
}
