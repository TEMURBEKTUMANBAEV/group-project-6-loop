package main.java.com.devxschool;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        /**
         * In math, the factorial of a positive integer n, denoted by n! is the product of all integers less than or equal to n.
         * Calculate factorial and output result to the console.
         * ex: 5! = 5 * 4 * 3 * 2 * 1
         * Enter a number to calculate its factorial:
         * 5
         * Factorial result: 120
         */

        // TODO write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        long number = scanner.nextLong();

        long result = calculate(number);
        System.out.println("Factorial result: " + result);
    }

    public static long calculate(long number) {
        // TODO IMPLEMENT METHOD
        long result = 1;

        for (long i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }
}