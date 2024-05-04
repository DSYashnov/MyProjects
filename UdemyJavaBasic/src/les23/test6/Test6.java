package les23.test6;

public class Test6 {
}
class Animal{
     String showName(){
        return "SomeAnimal";
    }
    void showInfoAboutAnimal(){
        System.out.println("Name of animal: " + showName());
    }
}
class Mouse extends Animal{
     String showName(){
        return "Jerry";
    }
    void showInfoAboutMouse(){
        System.out.println("Name of mouse: " + showName());
    }

    public static void main(String[] args) {
        Mouse animal = new Mouse();
        animal.showInfoAboutAnimal();
        animal.showInfoAboutMouse();
    }
}
