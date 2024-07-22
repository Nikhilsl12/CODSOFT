import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int attempts = 5;
        boolean check = true;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have " + attempts + " attempts to guess the number between " + 1 + " and " + 100 + ".");

        int generatedNumber = random.nextInt(100) + 1;

        for (int attempt = 1; attempt <= attempts; attempt++) {
            System.out.print("\nEnter your guess: ");
            int userGuess = sc.nextInt();

            if (userGuess == generatedNumber) {
                System.out.println("Congratulations! You guessed it right!");
                check = false;
                break;
            } else if (userGuess < generatedNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }

        if(check){
            System.out.println("\nThe correct number was: " + generatedNumber);
        }
        System.out.println("Thanks for playing!");
    }
}
