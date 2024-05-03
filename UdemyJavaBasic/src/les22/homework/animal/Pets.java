package les22.homework.animal;

public class Pets extends Animal{
    Pets(){
        System.out.println("I am pets");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTail() {
        return tail;
    }

    public int getPaw() {
        System.out.print("I have " + paw + " paws\n");
        return paw;
    }

    private String name;
    private final int tail = 1;
    private final int paw = 4;

    public void run(){
        System.out.println("Pets run");
    }
    public void jump(){
        System.out.println("Pets jump");
    }
}
