package les25.test3;

public class Test3 {
    public static void main(String[] args) {
        HelpAble h = new Doctor();
        Emplyoee e1 = new Doctor();
        Emplyoee e2 = new Teacher();
        Emplyoee e3 = new Driver();
        //Doctor d1 = (Doctor)e1;
        h.help();
        System.out.println(((Doctor)h).special);
        ((Doctor)h).health();
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
class Doctor extends Emplyoee implements HelpAble {
    public void help(){
        System.out.println("Doctor take help");
    }
    String special = "hirurg";
    void health() {
        System.out.println("health");
    }
}
class Teacher extends Emplyoee {
    void learn() {
        System.out.println("learn");
    }
}
class Driver extends Emplyoee{
    String carName;
    void driver(){
        System.out.println("Driver");
    }
}
interface HelpAble{
    void help();
}
