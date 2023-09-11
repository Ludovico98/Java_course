package Section_3_ControlStatments;

import java.util.Random;

public class RandomJava {
    public static void main(String[] args) {
        Random random = new Random();
        int myRandomNumber;

        myRandomNumber = random.nextInt();
        System.out.println("number is : " + myRandomNumber);

        myRandomNumber = random.nextInt(1000);
        System.out.println("0 to 999? : " + myRandomNumber);

        //shifting
        myRandomNumber = random.nextInt(1000) + 1;
        System.out.println("1 through 1000? : " + myRandomNumber);
    }
}
