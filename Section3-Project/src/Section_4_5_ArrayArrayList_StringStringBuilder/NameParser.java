package Section_4_5_ArrayArrayList_StringStringBuilder;

import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String fullName;
        String firstName;
        String lastName;

        System.out.println("what is your first name and last name? :");
        fullName = keyboard.nextLine();
        int whereIsSpace = fullName.indexOf(" ");

        firstName = fullName.substring(0, whereIsSpace);
        lastName = fullName.substring(whereIsSpace+1);

        System.out.println("First name : " + firstName);
        System.out.println("Last name : " + lastName);

        String upper = firstName.toUpperCase();
        String lower = lastName.toLowerCase();

        System.out.println("upper case first name : " + upper);
        System.out.println("lower case last name : " + lower);
    }
}
