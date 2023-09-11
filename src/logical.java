public class logical {
    public static void main(String[]args){
        boolean isRaining = true;
        boolean isWarm = false;

        boolean combined = isRaining && isWarm; // && this is AND
        System.out.println("is it raining and warm?: " + combined);

        combined = isRaining || isWarm;// || this is OR
        System.out.println("is it raining or warm?: "+ combined);

        combined = !isRaining;
        System.out.println("is NOT raining?: "+ combined);

        combined = !isWarm;
        System.out.println("is NOT warm?: "+ combined);

        combined = !isRaining || !isWarm;
        System.out.println("is NOT warm or is NOT raining?: "+ combined);

        combined = !isRaining && !isWarm;
        System.out.println("is NOT warm and is NOT raining?: "+ combined);



    }
}
