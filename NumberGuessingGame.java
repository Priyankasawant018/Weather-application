import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Define the range for the random number
        int lowerBound = 1;
        int upperBound = 100;
        
        // Generate a random number between lowerBound and upperBound
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        // Number of attempts allowed
        int maxAttempts = 10;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess the number.");
        
        // Game loop
        while (attempts < maxAttempts && !hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess < lowerBound || userGuess > upperBound) {
                System.out.println("Please enter a number between " + lowerBound + " and " + upperBound + ".");
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number correctly!");
            }
            
            // Show remaining attempts
            if (!hasGuessedCorrectly) {
                int remainingAttempts = maxAttempts - attempts;
                if (remainingAttempts > 0) {
                    System.out.println("You have " + remainingAttempts + " attempts left.");
                } else {
                    System.out.println("Sorry, you've run out of attempts. The number was " + targetNumber + ".");
                }
            }
        }
        
        scanner.close();
    }
}
