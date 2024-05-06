package les24.homework;

abstract class Animal {
    String name;
    Animal(String name){
        this.name = name;
    }
    abstract void eat();
    abstract void sleep();
    }
    abstract class Fish extends Animal {
    Fish(String name){
        super(name);
        this.name = name;
    }
    void sleep(){
        System.out.println("Vsegda interesno nabludat, kak spyat ribi");
    }
    abstract void swim();
}
abstract class Bird extends Animal implements SpeakAble {
    Bird(String name){
        super(name);
        this.name = name;
    }
    public void speak() {
        System.out.println(name + " sings");
    }
    abstract void fly();
}
abstract class Mammal extends Animal implements SpeakAble {
    Mammal(String name){
        super(name);
        this.name = name;
    }
    abstract void run();
}
interface SpeakAble {
    default void speak(){
        System.out.println("somebody speaks");
    }
}
class Mechenosec extends Fish{
    Mechenosec(String name){
        super(name);
        this.name = name;
    }
    void swim() {
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet!");
    }
    void eat() {
        System.out.println("Mechenosec ne hishnaya riba, i ona est obichniy ribiy korm");
    }
}
class Pingvin extends Bird implements SpeakAble {
    Pingvin(String name){
        super(name);
        this.name = name;
    }
    void eat() {
        System.out.println("Pingvin lubit est ribu");
    }
    void sleep() {
        System.out.println("pingvini spyat prijavshis drug k drugu");
    }
    void fly() {
        System.out.println("pingvini ne ymeyt lelat");
    }
    public void speak(){
        System.out.println("Pingviny ne ymeyt pet kak solovyi");
    }
}
class Lion extends Mammal {
    Lion(String name){
        super(name);
        this.name = name;
    }
    void eat(){
        System.out.println("Lion kak luboy hishnik lybit myaso");
    }
    void sleep() {
        System.out.println("bolshyy chast dnya Lev spit");
    }
    void run() {
        System.out.println("Lion ne samaya bistraya koshka");
    }
}

