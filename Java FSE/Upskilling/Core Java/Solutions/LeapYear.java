/*
4. Leap Year Checker
    • Objective: Apply nested conditional logic.
    • Task: Check if a given year is a leap year.
    • Instructions:
         Prompt the user to enter a year.
         A year is a leap year if it's divisible by 4 but not by 100, unless it's also divisible by 400.
         Display the result accordingly.
 */

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter a year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 != 0) System.out.println("Leap Year");
        } else if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
