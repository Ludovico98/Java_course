package Section_3_ControlStatments;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int input;
        int numberBox = 0;

        System.out.println("enter numbers");
        input = keyboard.nextInt();

        while (input >= 0) {
            numberBox = input + numberBox;
            input = keyboard.nextInt();
            if (input <= 0) {
                numberBox = input + numberBox;
            }
        }
        System.out.println("you have " + numberBox + " inside your box: ");
    }
}
