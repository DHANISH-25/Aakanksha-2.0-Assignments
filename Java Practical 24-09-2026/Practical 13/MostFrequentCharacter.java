import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        if (str.isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            int[] frequency = new int[256];

            for (int i = 0; i < str.length(); i++) {
                frequency[str.charAt(i)]++;
            }
            
            int maxCount = -1;
            char maxChar = ' ';
            
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch != ' ' && frequency[ch] > maxCount) {
                    maxCount = frequency[ch];
                    maxChar = ch;
                }
            }
            
            System.out.println("The most frequent character is '" + maxChar + "' occurring " + maxCount + " time(s).");
        }
        
        sc.close();
    }
}
