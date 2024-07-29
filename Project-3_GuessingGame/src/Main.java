import java.util.Scanner;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        guessingGame();
    }

    public static void guessingGame() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Hello and Welcome to the guessing game. \n You have 5 chances to guess a number between 1 and 10 correctly");
        int count = 0;
        int randomNumber = random.nextInt(10 - 1 + 1) + 1;
        while (count < 5) {
            System.out.print("Guess a number between 1 and 10: ");

            int guessAmount = input.nextInt();
            if (guessAmount == randomNumber) {
                System.out.print("You guessed correctly. You win! ");
                System.out.println("Thank you for playing!");
                break;
            }
            else if (guessAmount > randomNumber) {
                System.out.print("Your guess is too high. Guess again ! ");
            }
            else if (guessAmount < randomNumber) {
                System.out.print("Your guess is too low. Guess again ! ");
            }
            count ++;
            if (count == 5) {
                System.out.println("\nYou Lose !");
                System.out.println("Thank you for playing!");
                break;
            }
        }
    }
}