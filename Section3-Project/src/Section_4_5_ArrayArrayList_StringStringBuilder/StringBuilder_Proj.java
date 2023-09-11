package Section_4_5_ArrayArrayList_StringStringBuilder;

public class StringBuilder_Proj {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ludo Bitti");

        sb.append(" is awesome");
        System.out.println(sb);

        sb.insert(5, "Phillip ");
        System.out.println(sb);

        sb.replace(22,29,"amazing");
        System.out.println(sb);

        sb.delete(5,13);
        System.out.println(sb);

        sb.replace(0,5,"Dr.");
        System.out.println(sb);

    }
}
