package Q02;

import com.sun.glass.ui.Size;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        do {
            System.out.println("Enter a number : ");
            number = input.nextInt();

            if (number >= 0) {
                int digit = digitCount(number);
                System.out.println("The number " + number + " has " + digit + " numbers");
            }
        } while (number >= 0);

    }

    public static int digitCount(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }

        return count;
    }
}
