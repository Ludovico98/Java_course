package Section_4_5_ArrayArrayList_StringStringBuilder;

public class StringMethod {
    public static void main(String[] args) {
        String name = "John Something";
        String name2 = "John Something";
        String name3 = "Rob Pippo";
        String name4 = "Ludovico Bitti";

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();

        if (name.equals(name2)) {
            System.out.println("names are equal");
        } else {
            System.out.println("names are NOT equal");
        }

        if (name.compareTo(name3) > 0) {
            System.out.println("name > name3");
        } else {
            System.out.println("name <= name3");
        }

        if (name4.compareTo(name3) < 0) {
            System.out.println("HA, my name is bigger");
        }
        else {
            System.out.println("rip, small pp");
        }


    }
}
