package les22.inheritance;

public class Test1 {

}

class Human1 {
    Human1(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    String name;
    String surname;
}
class Student1 extends Human1 {
    int course;
    Student1(String name, String surname, int course){
        super(name, surname);
        this.course = course;
    }
    public static void main(String[] args) {
        Student1 st1 = new Student1("Kolya", "Ivanov", 3);
        System.out.println(st1.name);
        System.out.println(st1.surname);
        System.out.println(st1.course);
    }
}
