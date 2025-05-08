package Q03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to get multiplications : ");
        int N = input.nextInt();

        for(int i=1; i<= 10; i++){
            int result = N * 1;
            System.out.println( N + " x " + i + " = " + result);
        }
    }
}
