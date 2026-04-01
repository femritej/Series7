import java.util.Scanner;

public class TextAnalyzer {

    // Counts vowels in a word
    public static int countVowels(String word) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < word.length(); i++) {
            String letter = word.substring(i, i + 1);
            if (vowels.indexOf(letter) != -1) {
                count++;
            }
        }
        return count;
    }

    // Overloaded: count vowels in a sentence
    public static int countVowels(String sentence, boolean ignoreSpaces) {
        if (ignoreSpaces) {
            sentence = sentence.replace(" ", "");
        }
        return countVowels(sentence);  // calls the first version
    }

    // Checks if a word starts and ends with the same letter
    public static boolean isSymmetric(String word) {
        return word.substring(0, 1).equalsIgnoreCase(
               word.substring(word.length() - 1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        System.out.println("Vowel count: " + countVowels(word));
        System.out.println("Symmetric: " + isSymmetric(word));

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        System.out.println("Vowels (ignoring spaces): " +
       countVowels(sentence, true));
    }
}
