package les25.test1;

public class Test1 {
    public static void main(String[] args) {
        Employee e1 = new Teacher();
        Employee e2 = new Doctor();
        Employee e3 = new Driver();
        Employee[] array2 = {e1, e2, e3};
        String s1 = null;
        Object o = new Object();

//        for (Employee  e : array2){
//            e.work();
        System.out.println(o instanceof String);
        }
    }

abstract class Employee{
    void sleep(){
        System.out.println("Employee sleeps");
    }
    abstract void work();
}
class Teacher extends Employee implements HelpAble{
    @Override
    public void help() {
        System.out.println("Teacher helps");
    }
    void work(){
        System.out.println("Teacher works");
    }
}
class Driver extends Employee implements HelpAble{
    public void help() {
        System.out.println("Driver helps");
    }
    void work(){
        System.out.println("Driver works");
    }
}
class Doctor extends Employee implements HelpAble{
    public void help() {
        System.out.println("Doctor helps");
    }
    void work(){
        System.out.println("Doctor works");
    }
}
interface HelpAble{
    void help();
}