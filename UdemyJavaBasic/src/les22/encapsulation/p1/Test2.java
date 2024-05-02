package les22.encapsulation.p1;

import les22.encapsulation.Human;
public class Test2 {
    public static void main(String[] args) {
        Human human = new Human("male");
        human.setName(new StringBuilder("Stas"));
        human.setAge(50);
        human.setMass(50);
        System.out.println(human.getName());
        System.out.println(human.getAge());
        System.out.println(human.getMass());
    }

}
