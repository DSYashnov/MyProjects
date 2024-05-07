package les25.test3;

import les12.Test;

public class Test3 {
    public static void main(String[] args) {

        Emplyoee e1 = new Doctor();
        Emplyoee e2 = new Teacher();
        Emplyoee e3 = new Driver();
        Emplyoee e4 = new Emplyoee();
        Emplyoee [] arr =  {e1,e2,e3,e4};
        for (Emplyoee e : arr) {
            if(e instanceof Driver) {
                System.out.println(((Driver) e).carName);
                ((Driver) e).driver();
            }
        }
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
    String carName = "BMW";
    void driver(){
        System.out.println("Driver");
    }
}
interface HelpAble{
    void help();
}
