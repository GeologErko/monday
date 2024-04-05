package Oop1;

public class Human {
    private final String name;
    private final int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Human(int age, String name) {
        this.name = name;
        this.age = age;
    }
}
