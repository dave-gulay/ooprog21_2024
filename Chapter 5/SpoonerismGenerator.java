import java.util.Scanner;

public class SpoonerismGenerator {

    public static String getWord(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine().toLowerCase();
    }

    public static int vowelIndex(String word) {
        String vowels = "aeiou";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1; 
    }

    public static void run() {
        
        String word1 = getWord("Enter the first word: ");
        String word2 = getWord("Enter the second word: ");

       
        int vowelIndex1 = vowelIndex(word1);
        int vowelIndex2 = vowelIndex(word2);

       
        if (vowelIndex1 <= 0 || vowelIndex2 <= 0) {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
        } else {
            
            String prefix1 = word1.substring(0, vowelIndex1);
            String suffix1 = word1.substring(vowelIndex1);

            String prefix2 = word2.substring(0, vowelIndex2);
            String suffix2 = word2.substring(vowelIndex2);

            
            String spoonerizedWord1 = prefix2 + suffix1;
            String spoonerizedWord2 = prefix1 + suffix2;

            
            System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
        }
    }

    
    public static void main(String[] args) {
        run();
    }
}