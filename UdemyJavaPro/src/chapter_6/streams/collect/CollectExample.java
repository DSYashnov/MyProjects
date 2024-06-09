package chapter_6.streams.collect;

import java.util.*;
import java.util.stream.Collectors;


public class CollectExample {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        List<Student> students = new ArrayList<Student>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        Map<Integer, List<Student>> map = students.stream().map(e->
//        {e.setName(e.getName().toLowerCase());
//            return e;
//        })
//                .collect(Collectors.groupingBy(e->e.getCourse()));
//
//        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
//        }
        Map<Boolean, List<Student>> map =
                students.stream()
                .collect(Collectors.partitioningBy(e->e.getAvgGrade()>7));

        for (Map.Entry<Boolean, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }
    }
}
