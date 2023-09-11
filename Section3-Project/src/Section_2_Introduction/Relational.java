package Section_2_Introduction;

public class Relational {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 37;
        int yourAge = 20;
        int bobsAge = 20;
        int ludoAge = 25;
        int funAge = 21;

        String name1 = "ludo";
        String name2 = "ludo";
        String name3 = "ludovico";


        System.out.println("myBool is " + myBool);
        System.out.println("yourBool is " + yourBool);

        //relational operations
        boolean ageComparison = myAge > yourAge;
        System.out.println("myAge > yourAga?: " + ageComparison);

        ageComparison = yourAge > bobsAge;
        System.out.println("yourAge > bobsAge?: " + ageComparison);

        ageComparison = yourAge == bobsAge;

        System.out.println("yourAge == bobsAge?: " + ageComparison);

        boolean nameCompare = name1.equals(name2);

        System.out.println("names match?: " + nameCompare);

        nameCompare = name1.equals(name3);

        System.out.println("name match?: " + nameCompare);

        boolean legalDrinkUSA = ludoAge >= funAge;
        boolean legalDrinkUSATest = ludoAge <= funAge;

        System.out.println("can ludo drink in the us?:" + legalDrinkUSA);
        System.out.println("test age" + legalDrinkUSATest);

    }
}
