package Section_3_ControlStatments;

import java.util.Scanner;

public class Fraternity {
    public static void main(String[] something) {

        //declarations
        Scanner keyboard = new Scanner(System.in);
        int age;
        String gender;

        //dealing with gender
        System.out.print("what is your gender( M / F ) ?:\t");
        gender = keyboard.next().toString();

        switch (gender) {
            case "M":
            case "m":
                System.out.println("good candidate for fraternity");
                break;
            default:
                System.out.println("sorry not a valid gender");
                break;
        }

        //dealing with numbers
        System.out.print("what is your age?:\t");

        if (keyboard.hasNextInt()) {
            age = keyboard.nextInt();

            if (age >= 19 && gender == "m" || gender == "M") {
                System.out.println("welcome");
            } else if (age < 19 || gender != "m" || gender != "M") {
                System.out.println("can't join");
            }
        } else {
            System.out.println("That's not a valid age");
        }


    }//end main
}//end class
