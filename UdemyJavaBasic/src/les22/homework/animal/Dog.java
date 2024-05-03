package les22.homework.animal;

public class Dog extends Pets{
    Dog(String name){
        setName(name);
        System.out.println("My name is: " + getName());
    }
    public void play(){
        System.out.println("Dog plays");
    }
}
