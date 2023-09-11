package Section_3_ControlStatments;

public class ControlStatmentIntro {

    public static void main(String[] args) {
        int age = 15;

        if (age >= 18) {
            System.out.println("can drive");
        } else {
            System.out.println("come back next time");
        }
        for (int i = 1; i <= age; i++) {
            System.out.println("happyBday " + i);
        }//end for


    }//end main

}//end class
