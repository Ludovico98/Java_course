package Section_7_OOP;

public class HouseDemo {

    public static void main(String[] args) {
        House myHouse = new House();
        House yourHouse = new House(3, 10, "blue");

        myHouse.setNumStories(2);
        myHouse.setNumWindows(6);
        myHouse.setColour("red");

        printHouseData(myHouse);
        System.out.println();
        printHouseData(yourHouse);

        //the code below would need to be copied and paced and changed manually to be adapted for multiple house

//        yourHouse.setNumStories(3);
//        yourHouse.setNumWindows(9);
//        yourHouse.setColour("blue");

//        System.out.println("My house is " + myHouse.getColour() + " and has " + myHouse.getNumStories() + " stories and " + myHouse.getNumWindows() + " windows.");
//
//        System.out.println();
//
//        System.out.println("Your house is " + yourHouse.getColour() + " and has " + yourHouse.getNumStories() + " stories and " + yourHouse.getNumWindows() + " windows.");

    }

    //the code below is much can be used N amount and does not require changes

    public static void printHouseData(House house){

        System.out.println("The house is " + house.getColour()+
                "\nand has " + house.getNumStories() + " stories and "+
                "\n" + house.getNumWindows()+" windows");
    }
}
