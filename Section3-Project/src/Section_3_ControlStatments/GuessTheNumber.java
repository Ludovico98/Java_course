package Section_3_ControlStatments;
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        int userGuess;
        int numberToGuess;
        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("guess a number between 1 and 100");
        numberToGuess = random.nextInt(100);
        //System.out.println(numberToGuess);

        while (true) {
            userGuess = keyboard.nextInt();
            if (userGuess > numberToGuess) {
                System.out.println("Too high");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low");
            } else if (userGuess == numberToGuess) {
                System.out.println("CORRECT !!!");
                break;
            }
        }
    }
}