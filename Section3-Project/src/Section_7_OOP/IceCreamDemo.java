package Section_7_OOP;

public class IceCreamDemo {

    public static void main(String[] args) {

        IceCream myIceCream = new IceCream("Chocolate", 3, 2);
        IceCream youIceCream = new IceCream("Vanilla", 2, 1);

        myIceCream.addTopping("nuts");
        myIceCream.addTopping("cherry");

        youIceCream.addTopping("sprinkles");

        print(myIceCream);
        print(youIceCream);
    }

    public static void print(IceCream iceCream) {
        System.out.println(iceCream.getName());
        System.out.println("Cost £" + iceCream.getCost());
        System.out.println("Topped with: ");
        iceCream.printToppings();
        System.out.println();
    }

}
