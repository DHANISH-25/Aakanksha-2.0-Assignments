//7. Write a Java program to accept a total number of seconds and convert it into hours, minutes, and remaining seconds using division and modulus operators
import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of seconds to change into Hours, Minutes and remaining Seconds: ");
        int sec = sc.nextInt();

        int hours = sec/3600;
        sec = sec%3600;
        int minutes = sec/60;
        int seconds = sec%60;


        System.out.println("Total hours: " + hours);
        System.out.println("Total Minutes: " + minutes);
        System.out.println("Total seconds: " + seconds);

        sc.close();
    }
}
