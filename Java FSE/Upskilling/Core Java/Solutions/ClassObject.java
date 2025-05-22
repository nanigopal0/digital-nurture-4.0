/*
17. Class and Object Creation
    • Objective: Understand classes and objects.
    • Task: Create a Car class with attributes and methods.
    • Instructions:
        o Define attributes: make, model, year.
        o Implement a method displayDetails() to print car information.
        o Create objects of the Car class and call the method.
 */


class Car {
    String make, model;
    int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Make: " + make + "\nModel: " + model + "\nYear: " + year);
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Car car = new Car("BMW", "X5", 2020);
        car.displayDetails();
    }
}
