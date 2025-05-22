/*
15. String Reversal
    • Objective: Manipulate strings.
    • Task: Reverse a string entered by the user.
    • Instructions:
        o Prompt the user for a string.
        o Use a loop or StringBuilder to reverse the string.
        o Display the reversed string.
 */


import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Reversed string using StringBuilder is " + sb.toString());
        //Using loop
        StringBuilder rev = new StringBuilder();
        for (int i = str.length()-1; i >=0; i--) {
            rev.append(str.charAt(i));
        }
        System.out.println("Reversed string using loop is " + rev);
    }
}
