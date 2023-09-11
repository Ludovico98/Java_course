package Section_4_5_ArrayArrayList_StringStringBuilder;

import java.util.ArrayList;

public class Wrapper {
    public static void main(String[] args) {

        ArrayList<Integer> myAL = new ArrayList<>();

        myAL.add(10);
        myAL.add(22);

        for (int i = 0; i < myAL.size(); i++) {
            System.out.println(myAL.get(i));
        }

        String someValue = "450";
        int numericValue = Integer.parseInt(someValue);
        numericValue += 10.25;

        System.out.println(numericValue);


        String someValueDouble = "450.2999999";
        Double numericValueDouble = Double.parseDouble(someValueDouble);
        numericValueDouble += 10.199999999999999999999999999999999;

        System.out.println(numericValueDouble);

        String someValueFloat = "450.2999999";
        float numericValueFloat = Float.parseFloat(someValueFloat);
        numericValueFloat += 10.199999999999999999999999999999999;

        System.out.println(numericValueFloat);

    }

}
