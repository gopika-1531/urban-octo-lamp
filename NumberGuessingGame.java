import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1; // 1 to 100
        int guess = 0;
        int attempts = 0;
        int maxAttempts = 5;

        System.out.println("🎯 Welcome to Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have " + maxAttempts + " attempts\n");

        while (guess != numberToGuess && attempts < maxAttempts) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > numberToGuess) {
                System.out.println("Too High! 📈");
            } else if (guess < numberToGuess) {
                System.out.println("Too Low! 📉");
            } else {
                System.out.println("🎉 Congratulations! You guessed it right in " 
                                   + attempts + " attempts.");
            }
        }

        if (guess != numberToGuess) {
            System.out.println("\n❌ Game Over!");
            System.out.println("The correct number was: " + numberToGuess);
        }

        sc.close();
    }
}
