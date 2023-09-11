package Section_4_5_ArrayArrayList_StringStringBuilder;

public class StringMethods2 {
    public static void main(String[] args) {
        String myName = "Ludovico Bitti";

        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();

        int whereIsB = myName.indexOf("B");

        String lastName = myName.substring(9);

        System.out.println("Upper is " + upper);
        System.out.println("lower is " + lower);
        System.out.println("B is at index " + whereIsB);
        System.out.println("Last name is " + lastName);
    }
}
