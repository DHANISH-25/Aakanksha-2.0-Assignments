import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        if (str1.equals(str2)) {
            System.out.println("\n[Case-Sensitive] The strings are EQUAL.");
        } else {
            System.out.println("\n[Case-Sensitive] The strings are NOT EQUAL.");
        }

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("[Case-Insensitive] The strings are EQUAL (ignoring case).");
        } else {
            System.out.println("[Case-Insensitive] The strings are NOT EQUAL (even ignoring case).");
        }
        
        sc.close();
    }
}
