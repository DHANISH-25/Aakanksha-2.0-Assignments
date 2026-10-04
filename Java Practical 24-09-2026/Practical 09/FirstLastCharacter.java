import java.util.Scanner;

public class FirstLastCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            char firstChar = str.charAt(0);
            
            char lastChar = str.charAt(str.length() - 1);
            
            System.out.println("First character: " + firstChar);
            System.out.println("Last character: " + lastChar);
        }
        
        sc.close();
    }
}

