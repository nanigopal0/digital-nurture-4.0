/*
11. Factorial Calculator
    • Objective: Use loops to perform repetitive calculations.
    • Task: Calculate the factorial of a number entered by the user.
    • Instructions:
        o Prompt the user for a non-negative integer.
        o Use a for loop to calculate the factorial.
        o Display the result.
 */

import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        System.out.println("Enter a non-negative integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("You entered a negative number!");
            return;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        System.out.println("The factorial of " + n + " is " + fact);
    }
}
