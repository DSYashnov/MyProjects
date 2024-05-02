package les22.inheritance;

public class Test {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.name = "Ivan";
        doctor.age = 20;
        doctor.eat();
        doctor.walk();
    }
}
class Emplyoee{
    double salary;
    String name;
    int age;
    int experience;
    void eat(){
        System.out.println("Eat");
    }
    void sleep(){
        System.out.println("Sleep");
    }
}

class Doctor extends Emplyoee {
    void walk() {
        System.out.println("Walk");
    }
}
    class Teacher extends Emplyoee{
        void talk() {
            System.out.println("Talk");
        }
    }


