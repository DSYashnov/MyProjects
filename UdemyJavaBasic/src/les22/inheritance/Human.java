package les22.inheritance;

public class Human {
    public String name = "Stas";
    public static int salary = 150;
    public void work(){
        System.out.println("Job");
    }
    public static void sayHello(){
        System.out.println("Hello");
    }
}
class Student extends Human{
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.salary);
        s1.work();
        s1.sayHello();
    }
}
