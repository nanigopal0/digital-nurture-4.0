/*
20. Try-Catch Example
    • Objective: Handle exceptions gracefully.
    • Task: Handle division by zero using try-catch.
    • Instructions:
        o Prompt the user for two integers.
        o Attempt to divide the first by the second.
        o Catch any ArithmeticException and display an appropriate message.
 */

import java.util.Scanner;

public class TryCatchEx {
    public static void main(String[] args) {
        System.out.println("Enter two integers: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
            int result = a / b;
            System.out.println("Result is " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
