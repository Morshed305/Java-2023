
package Class;
import java.util.Random;
import java.util.Scanner;
public class GuessTheNumberGame {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 10;
        int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I have selected a number between " +
                lowerBound + " and " + upperBound + ". Try to guess it.");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == secretNumber) {
                hasGuessedCorrectly = true;
            } else {
                System.out.println("Sorry, incorrect guess. Try again.");
            }
        }

        System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");

        scanner.close();
    }
}
 
    
    
    
    

