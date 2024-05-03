package les22.homework.animal;

public class Animal {
    Animal(){
        System.out.println("I am animal");
    }
    public int getEyes() {
        return eyes;
    }
    private final int eyes = 2;
    public void eat(){
        System.out.println("I am eating.");
    }
    public void drink(){
        System.out.println("I am drinking.");
    }
}
