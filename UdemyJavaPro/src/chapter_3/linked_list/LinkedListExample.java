package chapter_3.linked_list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        Student st1 = new Student("Stanislav", 29);
        Student st2 = new Student("Sarah", 28);
        Student st3 = new Student("Elena", 18);
        Student st4 = new Student("Anastasia", 25);
        Student st5 = new Student("Ivan", 23);

        LinkedList<Student> list = new LinkedList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        System.out.println("LinkedList = " + list);
        System.out.println(list.get(2));
        Student st6 = new Student("Zahar", 23);
        Student st7 = new Student("Igor", 25);
        list.add(st6);
        System.out.println("LinkedList = " + list);
        list.add(1, st7);
        System.out.println("LinkedList = " + list);
        list.remove(3);
        System.out.println(list);
    }

}
class Student {
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}