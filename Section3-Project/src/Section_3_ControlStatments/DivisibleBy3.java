package Section_3_ControlStatments;

import java.util.Scanner;

public class DivisibleBy3 {

    public static void main(String[] args) {
        int question;
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("write a number and i'll tell you if it's divisible by 3");
            question = keyboard.nextInt();

            if (question % 3 == 0) {
                System.out.println(question + " IS divisible by 3");
            } else {
                System.out.println("sorry it is NOT divisible by 3");
            }
        }
    }

}
