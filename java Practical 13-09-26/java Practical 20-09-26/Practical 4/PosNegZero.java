import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter 10 values in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int pos = 0;
        int zero = 0;
        int neg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos++;
            }else if (arr[i] == 0) {
                zero++;
            } else if (arr[i] < 0) {
                neg++;
            }
        }

        System.out.println("Positive Number count: " + pos);
        System.out.println("Negative Number count: " + neg);
        System.out.println("Zero Number count: " + zero);

        sc.close();
    }
}
