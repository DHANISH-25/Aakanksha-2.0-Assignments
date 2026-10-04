import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        String trimmedSentence = sentence.trim();
        
        if (trimmedSentence.isEmpty()) {
            System.out.println("Total number of words: 0");
        } else {

            String[] words = trimmedSentence.split("\\s+");

            System.out.println("Total number of words: " + words.length);
        }
        
        sc.close();
    }
}

