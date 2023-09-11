package Section_3_ControlStatments;

import java.util.Scanner;

public class LearningPackage_Project {

    public static void main(String[] args) {

        int monthCost = 0;
        int addCost = 0;
        int courseQ;
        int courseIncluded = 0;
        Scanner keyboard = new Scanner(System.in);
        String packageCourse;

        System.out.println("which package do have, 1, 2, 3 ?");
        packageCourse = keyboard.next().toString();
        System.out.println("how many additional courses have you done ?");
        courseQ = keyboard.nextInt();

        switch (packageCourse) {
            case "1":
                monthCost = 10;
                courseIncluded = 2;
                addCost = 6 * (courseQ - courseIncluded);
                addCost = checkNumber(addCost);
                System.out.println("here's how much you need to pay: \t£" + (monthCost + addCost));
                break;
            case "2":
                monthCost = 12;
                courseIncluded = 4;
                addCost = 4 * (courseQ - courseIncluded);
                addCost = checkNumber(addCost);
                System.out.println("here's how much you need to pay!: \t£" + (monthCost + addCost));
                break;
            case "3":
                monthCost = 15;
                courseIncluded = 6;
                addCost = 3 * (courseQ - courseIncluded);
                addCost = checkNumber(addCost);
                System.out.println("here's how much you need to pay!!: \t£" + (monthCost + addCost));
                break;
            default:
                System.out.println("sorry not valid");
        }
    }

    private static int checkNumber(int addCost) {
        if (addCost <= 0) {
            return 0;
        } else return addCost;
    }
}

