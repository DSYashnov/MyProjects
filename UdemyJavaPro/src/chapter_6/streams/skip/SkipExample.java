package chapter_6.streams.skip;

import chapter_6.streams.limit.Student;

import java.util.ArrayList;
import java.util.List;

public class SkipExample {
    public static void main(String[] args) {

        chapter_6.streams.limit.Student st1 = new chapter_6.streams.limit.Student("Ivan", 'm', 22, 3, 8.3);
        chapter_6.streams.limit.Student st2 = new chapter_6.streams.limit.Student("Nikolay", 'm', 28, 2, 6.4);
        chapter_6.streams.limit.Student st3 = new chapter_6.streams.limit.Student("Elena", 'f', 19, 1, 8.9);
        chapter_6.streams.limit.Student st4 = new chapter_6.streams.limit.Student("Petr", 'm', 35, 4, 7);
        chapter_6.streams.limit.Student st5 = new chapter_6.streams.limit.Student("Mariya", 'f', 23, 3, 9.1);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        Student min = students.stream().min((x, y) -> x.getAge() - y.getAge()).get();
//        System.out.println(min);
//
//        Student max = students.stream().max((x, y) -> x.getAge() - y.getAge()).get();
//        System.out.println(max);

        students.stream().filter(e -> e.getAge() > 20).forEach(System.out::println);
        System.out.println("----------------------------------------------");
        students.stream().filter(e -> e.getAge() > 20).limit(2).forEach(System.out::println);
        System.out.println("----------------------------------------------");
        students.stream().filter(e -> e.getAge() > 20).skip(3).forEach(System.out::println);
    }
}
