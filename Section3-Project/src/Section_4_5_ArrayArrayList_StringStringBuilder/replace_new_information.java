package Section_4_5_ArrayArrayList_StringStringBuilder;

import java.util.Scanner;

public class replace_new_information {
    public static void main(String[] args) {

        String information;
        String newInformation;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("write your first information here");
        information = keyboard.nextLine();

        System.out.println("now your new information");
        newInformation = keyboard.nextLine();

        for (int i = 0; i == i ; i++) {

            System.out.println("did you learn something new ?");
            newInformation = keyboard.nextLine();

            System.out.println("Current Information: "+information);
            System.out.println("New Information: "+newInformation);
            information = newInformation;

        }
    }
}
