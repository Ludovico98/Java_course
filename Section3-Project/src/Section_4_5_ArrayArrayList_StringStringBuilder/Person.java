package Section_4_5_ArrayArrayList_StringStringBuilder;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s is %s years old", this.name, this.age);
    }
}
