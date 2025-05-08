package Q04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of line you want in Pyramid : ");

        int height = input.nextInt();
        int space = height - 1;
        int asterisks = 1;

        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= space; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < asterisks; k++) {
                System.out.print("*");
            }


            System.out.println();
            asterisks += 2;
            space--;

        }
    }
}


