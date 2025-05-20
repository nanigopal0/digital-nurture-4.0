/*
2. Simple Calculator
    • Objective: Practice arithmetic operations and user input.
    • Task: Develop a calculator that performs addition, subtraction, multiplication, and division.
    • Instructions:
         Prompt the user to enter two numbers.
         Ask the user to choose an operation.
         Display the result of the operation.

 */


import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter operation: +, -, *, /");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+': {
                System.out.println(a + b);
                break;
            }
            case '-': {
                System.out.println(a - b);
                break;
            }
            case '*': {
                System.out.println(a * b);
                break;
            }
            case '/': {
                if (b == 0) System.out.println("Division by zero");
                else System.out.println(a / b);
                break;
            }
            default: {
                System.out.println("Invalid operation");
            }
        }
    }
}
