import java.util.Random;
import java.util.Scanner;

public class guess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;
        int roundNumber = 1;
        int totalScore = 0;
        final int MAX_ATTEMPTS = 10;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            int numberToGuess = rand.nextInt(100) + 1;
            int attemptsLeft = MAX_ATTEMPTS;
            boolean guessedCorrectly = false;

            System.out.println("\nRound " + roundNumber + " begins! I have picked a number between 1 and 100.");

            while (attemptsLeft > 0) {
                System.out.print("Enter your guess (Attempts left: " + attemptsLeft + "): ");
                int userGuess = sc.nextInt();

                if (userGuess == numberToGuess) {
                    System.out.println("Correct! You've guessed the number.");
                    guessedCorrectly = true;
                    totalScore += attemptsLeft * 10;
                    break;
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }
                attemptsLeft--;
            }

            if (!guessedCorrectly) {
                System.out.println("Out of attempts! The number was: " + numberToGuess);
            }

            System.out.println("Your total score: " + totalScore);
            System.out.print("Do you want to play another round? (yes/no): ");
            playAgain = sc.next().equalsIgnoreCase("yes");
            roundNumber++;
        }

        System.out.println("Game Over! Your final score is: " + totalScore);
        sc.close();
    }
}
