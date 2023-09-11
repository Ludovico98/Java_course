package Section_2_Introduction;

import java.util.Scanner;

public class keyboardInPut {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        int age;
        float magicNumber;

        System.out.println("What is your name?");
        name = keyboard.nextLine();

        System.out.println("what's your age?");
        age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("what's your magic number?");
        magicNumber = keyboard.nextFloat();
        keyboard.nextLine();
        magicNumber *= 2;

        System.out.println("which city do you live in?");
        city = keyboard.nextLine();

        System.out.println("Hello, " + name);
        System.out.println("age is " + age);
        System.out.println("city is " + city);
        System.out.println("your magic number *2 is " + magicNumber);


    } //end main

}
