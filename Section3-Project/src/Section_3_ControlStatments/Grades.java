package Section_3_ControlStatments;

import java.util.Scanner;

public class Grades {
    public static void main(String[] something) {
        Scanner keyboard = new Scanner(System.in);

        char grade;
        System.out.println("Enter grade");
        grade = keyboard.next().charAt(0);

        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("Nerd");
                break;
            case 'B':
            case 'b':
                System.out.println("Meh");
                break;
            case 'C':
            case 'c':
                System.out.println("CocaCola");
                break;
            case 'D':
            case 'd':
                System.out.println("Bruh");
                break;
            case 'F':
            case 'f':
                System.out.println("HAHAHA");
                break;
            default:
                System.out.println("what is this?");

        }
    }
}
