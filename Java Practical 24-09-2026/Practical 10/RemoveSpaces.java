import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String original = sc.nextLine();
        
        String result = original.replaceAll("\\s", "");
        
        
        System.out.println("String after removing all spaces: " + result);
        
        sc.close();
    }
}

