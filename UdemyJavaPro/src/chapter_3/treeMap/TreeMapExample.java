package chapter_3.treeMap;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Student, Double> treeMap = new TreeMap<>();
        Student student = new Student("Stanislav", "Yashnov", 3);
        Student student1 = new Student("Mariya", "Shostak", 1);
        Student student2 = new Student("Anna", "Ivanovna", 4);
        Student student3 = new Student("Stanislav", "Yashnov", 3);
        Student student4 = new Student("Mariya", "Shostak", 1);
        Student student5 = new Student("Anna", "Ivanovna", 4);
        Student student6 = new Student("Stanislav", "Yashnov", 3);
        Student student7 = new Student("Mariya", "Shostak", 1);
        Student student8 = new Student("Mariya", "Shostak", 1);

        treeMap.put(student, 5.8);
        treeMap.put(student1, 6.4);
        treeMap.put(student2, 7.7);
        treeMap.put(student3, 8.1);
        treeMap.put(student4, 5.6);
        treeMap.put(student5, 8.8);
        treeMap.put(student6, 9.6);
        treeMap.put(student7, 9.4);
        treeMap.put(student8, 9.4);


        System.out.println(treeMap);
//        System.out.println(treeMap.get(6.4));
//        System.out.println(treeMap.remove(5.8));
//        System.out.println(treeMap.descendingMap());
//        System.out.println(treeMap.tailMap(6.4));
//        System.out.println(treeMap.headMap(8.8));
        System.out.println(treeMap.lastEntry());

        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.containsKey(student8));
        System.out.println(treeMap.containsValue(student8));
    }
}
final class Student implements Comparable<Student> {
    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, surname, course);
//    }
    @Override
        public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
    String name;
    String surname;
    int course;
}
