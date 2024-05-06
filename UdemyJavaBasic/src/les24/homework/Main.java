package les24.homework;

public class Main {
    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("Mechenosec");
        System.out.println(mechenosec.name);
        mechenosec.eat();
        mechenosec.swim();
        mechenosec.sleep();

        System.out.println();
        SpeakAble pingvin = new Pingvin("Pingvin");
        pingvin.speak();

        System.out.println();
        Animal lion = new Lion("Lion");
        System.out.println(lion.name);
        lion.eat();
        lion.sleep();

        System.out.println();
        Mammal mammal = new Lion("Mammal");
        System.out.println(mammal.name);
        mammal.eat();
        mammal.sleep();
        mammal.speak();
        mammal.run();
    }
}
