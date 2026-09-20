
import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("write from 1 to 7 for display the corresponding name of days: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Day: Monday");
                break;
            case 2:
                
                System.out.println("Day: Tuesday");
                break;
            case 3:
                
                System.out.println("Day: Wednesday");
                break;
            case 4:
               
                System.out.println("Day: Thursday");
                break;
            case 5:
                
                System.out.println("Day: Friday");
                break;
            case 6:
               
                System.out.println("Day: Saturday");
                break;
            case 7:
                
                System.out.println("Day: Sunday");
                break;

            default:
                System.out.println("You are not entered number from 1 to 7 please write 1 to 7.");
                break;
        }

        sc.close();
    }
}