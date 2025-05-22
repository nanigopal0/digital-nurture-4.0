/*
12. Method Overloading
    • Objective: Understand method overloading in Java.
    • Task: Create multiple methods with the same name but different parameters.
    • Instructions:
        o Define methods named add that accept:
            ▪ Two integers.
            ▪ Two doubles.
            ▪ Three integers.
        o Each method should return the sum of its parameters.
        o Call each method and display the results.
 */

public class MethodOverloading {

    public static int add(int a, int b){
        return a+b;
    }

    public static double add(double a, double b){
        return a+b;
    }

    public static int add(int a,int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        int a = 3,b=66,c=343;
        double n1 = 234.23,n2 = 654434.344545;
        System.out.println("Sum of 2 integers: "+add(a,b));
        System.out.println("Sum of 2 doubles: "+add(n1,n2));
        System.out.println("Sum of 3 integers: "+add(a,b,c));
    }
}
