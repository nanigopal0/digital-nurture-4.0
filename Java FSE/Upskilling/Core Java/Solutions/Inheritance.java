/*
18. Inheritance Example
    • Objective: Implement inheritance.
    • Task: Create a base class Animal and a subclass Dog.
    • Instructions:
        o Animal class should have a method makeSound().
        o Dog class should override makeSound() to print "Bark".
        o Instantiate both classes and call their methods.
 */


class Animal {

    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.makeSound();
        dog.makeSound();
    }
}
