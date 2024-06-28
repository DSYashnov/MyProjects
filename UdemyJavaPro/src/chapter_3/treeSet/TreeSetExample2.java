package chapter_3.treeSet;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Stanislav",  4);
        Student st2 = new Student("Oleg",  3);
        Student st3 = new Student("Mariya",  1);
        Student st4 = new Student("Daria",  2);
        Student st5 = new Student("John",  5);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        Student st6 = new Student("Anna",  2);
        Student st7 = new Student("Ivan",  4);
        System.out.println(treeSet.subSet(st6, st7));
        System.out.println(st4.equals(st6));
        System.out.println(st4.hashCode() == st6.hashCode());
    }
}
class Student implements Comparable<Student> {
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student o) {
        return this.course-o.course;
    }

    String name;
    int course;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}