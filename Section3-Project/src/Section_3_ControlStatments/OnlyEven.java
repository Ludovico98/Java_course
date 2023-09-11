package Section_3_ControlStatments;

public class OnlyEven {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
