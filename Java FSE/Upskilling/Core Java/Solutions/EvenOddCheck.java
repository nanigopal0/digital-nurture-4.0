/*
3. Even or Odd Checker
    • Objective: Utilize conditional statements.
    • Task: Determine if a number entered by the user is even or odd.
    • Instructions:
         Prompt the user for an integer.
         Use the modulus operator % to check divisibility by 2.
         Display whether the number is even or odd.
 */

import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println(num + " is an even number");
        else System.out.println(num + " is an odd number");
    }
}
