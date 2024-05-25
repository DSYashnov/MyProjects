package chapter_3.array_list;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListRemove {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 18, 3, 8.3);
        Student st2 = new Student("Petr", 21, 2, 9.1);
        Student st3 = new Student("Mariya", 22, 1, 8.8);
        Student st4 = new Student("Olga", 19, 4, 7);
        Student st5 = new Student("Stanislav", 29, 5, 7.4);
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        System.out.println(list);
        Student st6 = new Student("Mariya", 22, 1, 8.8);
        //list.remove(st6);
        System.out.println(list);
        int index = list.indexOf(st6);
        System.out.println(index);
    }
}
class Student{
    public Student(String name, int age, int course, double avgGrade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && course == student.course && Double.compare(avgGrade, student.avgGrade) == 0 && Objects.equals(name, student.name);
    }

    private String name;
    private int age;
    private int course;
    private double avgGrade;
}
