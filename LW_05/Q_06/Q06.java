package Q_06;

import java.util.Random;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        // Initialize random number generator
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        // Create input scanner
        Scanner inputScanner = new Scanner(System.in);
        int userGuess;
        int attemptCount = 0;

        System.out.println("Guess the number between 1-100:");

        // Main game loop
        while (true) {
            userGuess = inputScanner.nextInt();
            attemptCount++;

            if (userGuess < targetNumber) {
                System.out.println("Higher! Try again:");
            } else if (userGuess > targetNumber) {
                System.out.println("Lower! Try again:");
            } else {
                System.out.printf("Correct! Guessed in %d attempts.%n", attemptCount);
                break;
            }
        }

        inputScanner.close();
    }
}