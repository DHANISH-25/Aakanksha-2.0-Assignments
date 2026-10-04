import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
       
        int[] frequency = new int[256];
        
       
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++; 
        }
        
        System.out.println("\nDuplicate characters and their frequencies:");
        boolean foundDuplicate = false;
        
       
        for (int i = 0; i < frequency.length; i++) {
            
            if (frequency[i] > 1) {
                
                if ((char)i != ' ') { 
                    System.out.println("'" + (char)i + "' occurs " + frequency[i] + " times");
                    foundDuplicate = true;
                }
            }
        }
        
        if (!foundDuplicate) {
            System.out.println("No duplicate characters found.");
        }
        
        sc.close();
    }
}
