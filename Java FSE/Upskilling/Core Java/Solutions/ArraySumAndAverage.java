/*
14. Array Sum and Average
    • Objective: Work with arrays and perform calculations.
    • Task: Calculate the sum and average of elements in an array.
    • Instructions:
        o Prompt the user to enter the number of elements.
        o Read the elements into an array.
        o Calculate and display the sum and average.
 */


import java.util.Scanner;

public class ArraySumAndAverage {

    public static void main(String[] args) {
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (int i : arr)
            sum += i;
        System.out.println("Sum of array elements is " + sum);
        double avg = (double) sum / arr.length;
        System.out.println("Average of array elements is " + avg);
    }
}
