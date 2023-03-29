package main.java.com.devxschool;

import java.util.Scanner;

public class Presence {
    public static void main(String[] args) {
        /**
         * Write a program that checks the presence of a number in an array.
         * Array is a collection of similar data elements stored at contiguous memory locations.
         * It is the simplest data structure where each data element
         * can be accessed directly by only using its index number
         *
         * Example output:
         *
         * Enter the number: 53
         * PRESENT
         *
         * Example output 2:
         *
         * Enter the number: 1
         * NOT PRESENT
         *
         * TIPS:
         * array[index] -> get the number at index from an array
         * array.length -> get the length of an array
         */
        Scanner sc = new Scanner(System.in);
        int[] array ={32,45,53,65,43,23};
        int numberToBeFound;

        // TODO WRITE CODE HERE
        System.out.print("Enter the number: ");
        numberToBeFound = sc.nextInt();
        System.out.println(checkPresence(array, numberToBeFound));
    }

    public static String checkPresence(int[] array, int numberToBeFound) {
        // TODO IMPLEMENT METHOD
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToBeFound) {
                return "PRESENT";
            }
        }
        return "NOT PRESENT";
    }

}
