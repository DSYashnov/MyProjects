package les26.test7;

public class Test7 {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        System.out.println("-------------------------");
        Lion lion = new Lion();
    }
}
class Animal{
    Animal(){
        System.out.println("Constructor of Animal");
    }
    static {
        System.out.println("static init of Animal");
    }
    {
        System.out.println("non-static init of Animal");
    }
}
class Mammal extends Animal {
    Mammal(){
        System.out.println("Constructor of Mammal");
    }
    static {
        System.out.println("static init of Mammal");
    }
    {
        System.out.println("non-static init of Mammal");
    }
}
class Lion extends Mammal {
    Lion(){
        System.out.println("Constructor of Lion");
    }
    static {
        System.out.println("static init of Lion");
    }
    {
        System.out.println("non-static init of Lion");
    }
}
