package Section_2_Introduction;

import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double numberA;
        double numberB;
        double numberC;
        double numberAve;

        System.out.println("enter three number ");
        numberA = keyboard.nextDouble();
        numberB = keyboard.nextDouble();
        numberC = keyboard.nextDouble();
        keyboard.nextLine();

        numberAve = (numberA + numberB + numberC) / 3;

        System.out.println("your average is:" + numberAve);

    }
}
