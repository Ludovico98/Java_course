package Section_8_FileIO_Exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutput {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("output.txt");

            pw.println("Hello there");
            pw.println("My name is Ludo! new");
            pw.close();

        }
        catch (FileNotFoundException ex){

        }
    }
}
