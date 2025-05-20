package Q07;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        System.out.println("Enter the word to be replaced:");
        String wordToReplace = scanner.next();

        System.out.println("Enter the replacement word:");
        String replacementWord = scanner.next();

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(wordToReplace)) {
                words[i] = replacementWord;
            }
        }

        // Rebuild sentence using StringBuilder
        StringBuilder modifiedSentenceBuilder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            modifiedSentenceBuilder.append(words[i]);
            if (i < words.length - 1) {
                modifiedSentenceBuilder.append(" ");
            }
        }
        String modifiedSentence = modifiedSentenceBuilder.toString();

        System.out.println("Modified sentence:");
        System.out.println(modifiedSentence);

        scanner.close();
    }
}
