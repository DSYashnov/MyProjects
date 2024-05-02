package les22.inheritance;

public class Test1 {

}

class Human1 {
    private Human1(){
    }
    String name;
    String surname;
}
class Student1 extends Human1 {
    Student1() {
        System.out.println("Hello");
    }
    Student1 st1 = new Student1();
}
