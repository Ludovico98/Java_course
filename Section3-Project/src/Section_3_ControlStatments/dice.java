package Section_3_ControlStatments;

import java.util.Random;

public class dice {
    public static void main(String[] args) {

        Random random = new Random();
        int myRandomNumber;
        System.out.println("Roll your dice");

        for (int i = 0; i < 10; i++) {
            myRandomNumber = random.nextInt(7);
            System.out.println("This roll is: \t" + myRandomNumber);
        }

    }
}
