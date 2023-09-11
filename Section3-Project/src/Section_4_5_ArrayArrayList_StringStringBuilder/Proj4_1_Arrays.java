package Section_4_5_ArrayArrayList_StringStringBuilder;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> numbersArray = new ArrayList<>();
        int quantityNumbers;
        int numbers = 0;
        int maths;

        System.out.println("How many numbers you want to calculate?");
        quantityNumbers = (keyboard.nextInt());

        while (quantityNumbers > numbersArray.size()) {
            System.out.println("type a number:");
            numbers = keyboard.nextInt();
            numbersArray.add(numbers);
        }

        for (int i = 0; i < numbersArray.size(); i++) {
            maths = numbersArray.get(i);
            System.out.println("the double of " + maths + " is: " + (maths * 2));
        }
    }
}