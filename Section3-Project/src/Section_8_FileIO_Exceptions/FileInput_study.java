package Section_8_FileIO_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInput_study {
    public static void main(String[] args) {
        Scanner infile;

        try{
            infile = new Scanner(new File("input.txt"));
            int input;
            int sum = 0;

            while (infile.hasNext()){
                input = infile.nextInt();
                System.out.println(input);
                sum += input;
            }

            System.out.println("sum is: " + sum);
            infile.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Can't find file!");
            System.out.println(ex.getMessage());
        }
        catch (InputMismatchException missMatchEx){
            System.out.println("Data is not an int");
        }

    }
}
