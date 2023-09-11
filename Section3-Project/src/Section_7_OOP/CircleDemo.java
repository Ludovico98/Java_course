package Section_7_OOP;

public class CircleDemo {
    public static void main(String[] args) {
        Circle unitCircle = new Circle();
        Circle myCircle = new Circle(5);
        Circle yourCircle = new Circle(12.75);

        printCircleData(unitCircle);
        printCircleData(myCircle);
        printCircleData(yourCircle);

    }

    public static void printCircleData(Circle circle) {
        System.out.println("r = " + circle.getRadius());
        System.out.println("C = " + String.format("%.4f", circle.circumferance()));
        System.out.println("A = " + String.format("%.4f", circle.area()));
        System.out.println();
    }
}
