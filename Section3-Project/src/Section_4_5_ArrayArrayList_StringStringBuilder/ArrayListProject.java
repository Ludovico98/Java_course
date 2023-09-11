package Section_4_5_ArrayArrayList_StringStringBuilder;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListProject {
    public static void main(String[] args) {

        ArrayList<String> namesList = new ArrayList<>();

        namesList.add("name1");
        namesList.add("name2");
        namesList.add("name3");
        namesList.add("name4");
        namesList.add("name5");

//        for (int i = namesList.size()-1; i >= 0; i--) {
//            System.out.println(namesList.get(i));
//        }

        Collections.reverse(namesList);

        for (String name : namesList) {

            System.out.print("\\ " + name);

        }
    }
}
