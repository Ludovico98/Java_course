package Section_6_Methods;

public class CountDown {
    public static void main(String[] args) {
      //  countDownFrom(10);
        countUpFrom(1, 30);
    }
    public static void countDownFrom(int num){
        if (num>=0){
            System.out.println(num);
            countDownFrom(num -1);
        }
    }
    public static void countUpFrom(int from, int to){
        if (from <= to){
            System.out.println(from);
            countUpFrom(from + 1, to);
        }
    }
}
