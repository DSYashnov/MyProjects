package chapter_3.queue.priorityQueue;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueExample1 {
    public static void main(String[] args) {
        Student st1 = new Student("Stanislav",  4);
        Student st2 = new Student("Oleg",  3);
        Student st3 = new Student("Mariya",  1);
        Student st4 = new Student("Daria",  2);
        Student st5 = new Student("John",  5);
        PriorityQueue<Student> pq1 = new PriorityQueue<>();
        pq1.add(st1);
        pq1.add(st2);
        pq1.add(st3);
        pq1.add(st4);
        pq1.add(st5);
        System.out.println(pq1.poll());
        System.out.println(pq1.poll());
        System.out.println(pq1.poll());
        System.out.println(pq1.poll());
        System.out.println(pq1.poll());
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