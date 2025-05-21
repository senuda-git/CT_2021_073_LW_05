package Q07;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //User sentence input
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        //User replacing word input
        System.out.println("Enter the word to be replaced:");
        String wordToReplace = scanner.next();

        //User replacement word input
        System.out.println("Enter the replacement word:");
        String replacementWord = scanner.next();

        //dividing into words - neglect spaces
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(wordToReplace)) {
                words[i] = replacementWord;
            }
        }

        // Rebuild sentence using StringBuilder
        String modifiedSentence = String.join(" ", words);

        System.out.println("Modified sentence:");
        System.out.println(modifiedSentence);

        scanner.close();
    }
}
