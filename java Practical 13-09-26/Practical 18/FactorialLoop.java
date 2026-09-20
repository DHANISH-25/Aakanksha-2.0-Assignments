import java.util.Scanner;

public class FactorialLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long result = 1L;

        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        System.out.println(result);

        sc.close();
    }
}
