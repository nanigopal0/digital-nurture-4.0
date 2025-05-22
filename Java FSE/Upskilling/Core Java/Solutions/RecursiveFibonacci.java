/*
 13. Recursive Fibonacci
    • Objective: Implement recursion.
    • Task: Calculate the nth Fibonacci number using recursion.
    • Instructions:
        o Prompt the user for a positive integer n.
        o Define a recursive method fibonacci(int n) that returns the nth Fibonacci number.
        o Display the result.
 */


import java.util.Scanner;


// 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377

public class RecursiveFibonacci {

    public int fibonacci(int n) {
        if (n <= 1) return 0;
        if (n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Enter a positive integer: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Fibonacci number " + n + " is " + new RecursiveFibonacci().fibonacci(n));
    }
}
