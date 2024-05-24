package chapter_2.example;

public abstract class Participant {
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private String name;
    private int age;

    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
