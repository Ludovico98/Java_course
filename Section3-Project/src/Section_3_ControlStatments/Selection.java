package Section_3_ControlStatments;

import java.util.Scanner;

public class Selection {
    public static void main(String[] work) {
        int age;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("welcome to the pub & grill.");

        System.out.println("please enter age");
        age = keyboard.nextInt();

        if (age >= 21 && age <= 99) {
            System.out.println("Here, have a beer");
        } else if (age >= 100) {
            System.out.println("here's your coffin");
        } else {
            System.out.println("Bruh, get out");
        }

    }

}//end class
