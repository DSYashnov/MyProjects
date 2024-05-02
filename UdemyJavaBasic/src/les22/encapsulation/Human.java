package les22.encapsulation;

public class Human {
    final String sex;

    private StringBuilder name;
    private boolean clever;

    public boolean isClever() {
        return clever;
    }

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }
    public void setName(StringBuilder name) {
        this.name = name;
    }
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int i) {
        if (i > 0) {
            age = i;
        }
    }
    private int mass;
    public int getMass() {
        return mass;
    }
    public void setMass(int i) {
        if (i > 0) {
            mass = i;
        }
    }
    public Human (String sex) {
        this.sex = sex;
    }
}
class Test {
    public static void main(String[] args) {
        Human human = new Human("male");
        human.setName(new StringBuilder("Stas"));
        human.getName().append("!!!!!!");
        System.out.println(human.getName());
    }
}
