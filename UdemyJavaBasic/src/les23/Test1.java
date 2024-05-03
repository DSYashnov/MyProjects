package les23;

public class Test1 {
//    public Object abc(){
//        return new Doctor() {
//        };
//    }
    public static void main(String[] args) {
//        Doctor d = new Doctor();
//        Teacher t = new Teacher();
//        Driver dr = new Driver();
//        Employee e = new Employee();

        Employee emp1 = new Doctor();
        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.experience);
        emp1.eat();
        emp1.sleep();

        Employee emp2 = new Teacher();

        Employee emp3 = new Driver();

        Hirurg h = new Hirurg();

        Doctor d2 = new Hirurg();
        System.out.println(d2.age);
        System.out.println(d2.name);
        System.out.println(d2.experience);
        System.out.println(d2.salary);
        d2.eat();
        d2.sleep();
        d2.walk();

        Employee emp4 = new Hirurg();
    }
}
class Employee{
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

class Doctor extends Employee {
    void walk() {
        System.out.println("Walk");
    }
}

class Hirurg extends Doctor {
    String tools;
    void operacion(){}
}

class Teacher extends Employee {
    void talk() {
        System.out.println("Talk");
    }
}
class Driver extends Employee {
    String nameCar;
    void driving() {
        System.out.println("Driving");
    }
}