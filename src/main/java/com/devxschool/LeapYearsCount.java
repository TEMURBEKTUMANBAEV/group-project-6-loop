package main.java.com.devxschool;

import java.util.Scanner;

public class LeapYearsCount {

    public static void main(String[] args) {

        /**
         * We have a customer who was born on a leap date (04.28.1950). In 2010 she turned 60,
         * but officially she is 15 years old, since there were only 15 leap years between 1950 and 2010.
         *
         * Write a program that takes two years and counts the number of leap years between two years
         *
         * Example output:
         * Enter first year: 1950
         * Enter second year: 2010
         *
         * Number of leap years: 15
         *
         */

        Scanner sc = new Scanner(System.in);

        int startYear;
        int endDate;

        // TODO WRITE YOUR CODE HERE
        System.out.print("Enter first year: ");
        startYear = sc.nextInt();

        System.out.print("Enter second year: ");
        endDate = sc.nextInt();

        int leapYears = countLeapYearsBetweenYears(startYear, endDate);

        System.out.println("Number of leap years: " + leapYears);
    }

    public static int countLeapYearsBetweenYears(int startYear, int endYear) {
        // TODO IMPLEMENT METHOD
        int leapYears = 0;
        for (int year = startYear; year <= endYear; year++) {
            if (isLeapYear(year)) {
                leapYears++;
            }
        }
        return leapYears;
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
}