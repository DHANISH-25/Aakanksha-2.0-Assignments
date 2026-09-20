import java.util.Scanner;

public class Pelindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check number is pelimdrom or not?: ");
        int num = sc.nextInt();
        int originaNum = num;
        int pelindrom = 0;


        while (num > 0) {
            int temp = num % 10;
            pelindrom = pelindrom * 10 + temp;
            num = num / 10;
        }

        if (pelindrom == originaNum) {
            System.out.println("Your number is pelindrom");
        }else 
            System.out.println("Your number is not pelindrom");
        sc.close();
    }
}
