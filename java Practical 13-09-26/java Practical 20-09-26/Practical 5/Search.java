import java.util.Scanner;

public class Search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 values in an Array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Please Enter Your number: ");
        int num = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("Your number is present on " + i + " position");
                break;
            }
        }
        sc.close();

    }
}
