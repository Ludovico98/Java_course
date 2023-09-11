package Section_4_5_ArrayArrayList_StringStringBuilder;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3 {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter a name: ");
            String name = keyboard.nextLine();

            System.out.println("Enter a age: ");
            int age = keyboard.nextInt();

            people.add(new Person(name, age));
        }
        people.forEach(person -> System.out.println(person.toString()));
    }
}