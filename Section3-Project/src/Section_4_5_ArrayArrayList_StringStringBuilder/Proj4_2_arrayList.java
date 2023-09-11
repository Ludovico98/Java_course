package Section_4_5_ArrayArrayList_StringStringBuilder;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_arrayList {

    public static void main(String[] args) {
        Scanner somethings;
        somethings = new Scanner(System.in);
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> numbersArray = new ArrayList<>();
        int addedNumber = 1;

        System.out.println("Enter a number to add it to the list, if your number is below 0 the list will be printed");

        while (addedNumber > 0) {
            System.out.println("print a number");
            addedNumber = keyboard.nextInt();
            if (addedNumber <= 0) {
                break;
            }
            numbersArray.add(addedNumber);
        }
        for (int i = numbersArray.size() - 1; i >= 0; i--) {
            System.out.println("Here's the list: " + numbersArray.get(i));
        }
    }
}
