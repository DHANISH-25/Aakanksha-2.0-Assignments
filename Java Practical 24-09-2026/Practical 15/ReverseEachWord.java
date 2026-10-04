import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        String[] words = sentence.split(" ");
        String result = "";
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = "";
            
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord += word.charAt(j);
            }
            
            result += reversedWord;
            if (i < words.length - 1) {
                result += " ";
            }
        }
        
        System.out.println("Result: " + result);
        
        sc.close();
    }
}

