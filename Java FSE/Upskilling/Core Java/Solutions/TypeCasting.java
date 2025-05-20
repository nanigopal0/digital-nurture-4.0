/*
 7. Type Casting Example
    • Objective: Practice type casting between different data types.
    • Task: Convert a double to an int and vice versa.
    • Instructions:
         Declare a double variable with a decimal value.
         Cast it to an int and display the result.
         Declare an int variable and cast it to a double, then display.
 */

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("Enter a double value: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println("int equivalent of " + x + " is " + (int) x);
    }
}
