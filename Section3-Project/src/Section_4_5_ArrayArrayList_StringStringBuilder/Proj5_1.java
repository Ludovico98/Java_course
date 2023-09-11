package Section_4_5_ArrayArrayList_StringStringBuilder;

import java.util.ArrayList;
import java.util.Scanner;

// I have a vague idea of what's happening here, I copied the code directly from the course

public class Proj5_1 {
    public static void main(String[] args) {
        ArrayList<String> fistNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();

        Scanner keyboard = new Scanner(System.in);
        String fullName;
        String firstName;
        String lastName;
        int IndexOfSpace;

        final int NUM_NAMES = 3;

        for (int i = 0; i < NUM_NAMES; i++) {
            System.out.print("Please enter a name " + i + "\t");
            fullName = keyboard.nextLine();
            IndexOfSpace = fullName.indexOf(" ");
            firstName = fullName.substring(0, IndexOfSpace);
            lastName = fullName.substring(IndexOfSpace + 1);

            fistNames.add(firstName);
            lastNames.add(lastName);
        }
        for (int j = 0; j < fistNames.size(); j++) {
            for (int i = 0; i < lastNames.size(); i++) {
                System.out.print(fistNames.get(j) + " ");
                System.out.println(lastNames.get(i));
            }
        }
    }
}
