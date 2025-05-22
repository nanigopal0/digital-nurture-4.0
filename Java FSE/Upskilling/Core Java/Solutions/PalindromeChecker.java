/*
16. Palindrome Checker
    • Objective: Combine string manipulation and conditional logic.
    • Task: Check if a string is a palindrome.
    • Instructions:
        o Prompt the user for a string.
        o Remove any non-alphanumeric characters and convert to lowercase.
        o Check if the string reads the same forwards and backwards.
        o Display the result.
 */


import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String lowerCase = s.toLowerCase();
        for (int i = 0; i < lowerCase.length() / 2; i++) {
            if (lowerCase.charAt(i) != lowerCase.charAt(lowerCase.length() - 1 - i)) {
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }

}
