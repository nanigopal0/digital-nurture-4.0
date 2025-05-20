/*
9. Grade Calculator
    • Objective: Use conditional statements to determine grades.
    • Task: Assign grades based on marks entered by the user.
    • Instructions:
         Prompt the user for marks out of 100.
         Use if-else statements to assign grades:
            ▪ 90-100: A
            ▪ 80-89: B
            ▪ 70-79: C
            ▪ 60-69: D
            ▪ Below 60: F
         Display the assigned grade.
 */

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println("Enter marks out of 100: ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks > 100 || marks < 0) {
            System.out.println("Invalid marks!");
            return;
        }
        switch (marks / 10) {
            case 10, 9: {
                System.out.println("A");
                break;
            }
            case 8: {
                System.out.println("B");
                break;
            }
            case 7: {
                System.out.println("C");
                break;
            }
            case 6: {
                System.out.println("D");
                break;
            }
            default:
                System.out.println("F");
        }
    }
}
