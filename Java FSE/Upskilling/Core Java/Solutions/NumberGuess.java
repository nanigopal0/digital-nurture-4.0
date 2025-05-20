/*
10. Number Guessing Game
    • Objective: Implement loops and conditional logic.
    • Task: Create a game where the user guesses a randomly generated number.
    • Instructions:
         Generate a random number between 1 and 100.
         Prompt the user to guess the number.
         Provide feedback if the guess is too high or too low.
         Continue until the user guesses correctly.
 */

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(1, 101);
        System.out.println("Guess a number between 1 and 100: ");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        while (randomNumber != guess) {
            if (guess - 10 > randomNumber)
                System.out.println("Guess number too high! Guess again.");
            else if (guess + 10 < randomNumber)
                System.out.println("Guess number too low! Guess again.");
            else System.out.println("You are closing! Guess again.");
            guess = scanner.nextInt();
        }
        System.out.println("You guessed the correct number!");
    }
}
