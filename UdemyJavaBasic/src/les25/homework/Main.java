package les25.homework;

public class Main {
    public static void main(String[] args) {
        Mechenosec m2 = new Mechenosec("Mechenosec");
        Animal a1 = new Lion("Lion");
        Animal a2 = new Pingvin("Kovalski");
        Animal a3 = new Mechenosec("Mechenosec");
        Mammal m1 = new Lion("Mammal");
        Fish f1 = new Mechenosec("Mechenosec");
        Bird b1 = new Pingvin("NoFly");
        Lion l1 = new Lion("Lion");
        Pingvin p1 = new Pingvin("NoFly");
        SpeakAble s1 = new Pingvin("Pingvin");
        SpeakAble s2 = new Lion("Lion");


        SpeakAble[] array = {s1, s2, b1, m1, p1, l1};
        for (SpeakAble s : array) {
             if (s instanceof Lion) {
                Lion l = (Lion) s;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();
            } else if (s instanceof Pingvin) {
                Pingvin p = (Pingvin) s;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            }
            System.out.println("--------------------------------");
        }
        Animal [] array1 = {a1, a2, a3, f1, b1, m1, m2, l1, p1};
        for (Animal a : array1) {
            if (a instanceof Lion) {
                Lion l = (Lion) a;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();
            } else if (a instanceof Mechenosec) {
                Mechenosec m = (Mechenosec) a;
                System.out.println(m.name);
                m.eat();
                m.sleep();
                m.swim();
            }else if (a instanceof Pingvin) {
                Pingvin p = (Pingvin) a;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            }
            System.out.println("--------------------------------");
        }
    }
}
