import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
 
        String lowerStr = str.toLowerCase();
        
        int left = 0;
        int right = lowerStr.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (lowerStr.charAt(left) != lowerStr.charAt(right)) {
                isPalindrome = false;
                break; 
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is NOT a palindrome.");
        }
        
        sc.close();
    }
}

