package les22.homework.animal;

public class Cat extends Pets {
    Cat(String name){
        setName(name);
        System.out.println("I am cat and my name is:  " + getName());
    }
    public void sleep(){
        System.out.println("Cat sleeps");
    }
}

