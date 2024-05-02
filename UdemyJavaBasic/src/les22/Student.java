package les22;

import les22.inheritance.Human;

public class Student extends Human {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.salary);
        s1.work();
        s1.sayHello();
    }
}
