package Section_4_5_ArrayArrayList_StringStringBuilder;

public class ArrayExamples {
    public static void main(String[] args) {

        int[] myArray;
        myArray = new int[10];
        int numbers = 0;



        for (int i = 0; i < myArray.length; i++) {
            numbers = numbers + 1;
            myArray[i] = numbers;
            System.out.println(myArray[i]);
        }
//
//        for (int num : myArray) {
//            numbers = numbers + 1;
//            System.out.println(num);
//        }
//          same logic different code

    }//end main

}//end class
