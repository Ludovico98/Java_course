package Section_8_FileIO_Exceptions;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.ArrayList;


public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> NamesArray = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        int quantityNames;
        String name;

        System.out.println("How many names do you want in the list?");
        quantityNames = (keyboard.nextInt());

        while (quantityNames > NamesArray.size()) {
            System.out.println("Type a name");
            name = keyboard.next();
            NamesArray.add(name);
        }

        try {
            PrintWriter pw = new PrintWriter("names.txt");
            pw.println("Here's the list of names !!");
            pw.println();
            pw.println(NamesArray);
            pw.close();

        }
        catch (FileNotFoundException e) {
            System.out.println("Can't WRite to file!");

        }

        System.out.println(NamesArray);
    }
}
