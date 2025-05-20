/*
5.  Multiplication Table
    • Objective: Implement loops.
    • Task: Print the multiplication table for a number up to 10.
    • Instructions:
         Prompt the user for a number.
         Use a for loop to iterate from 1 to 10.
         Multiply the input number by the loop counter and display the result.
 */

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
