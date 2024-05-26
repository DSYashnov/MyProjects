package chapter_3.hashcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExample {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student student = new Student("Stanislav", "Yashnov", 3);
        Student student1 = new Student("Mariya", "Shostak", 1);
        Student student2 = new Student("Anna", "Ivanovna", 4);
        map.put(student, 7.5);
        map.put(student1, 8.7);
        map.put(student2, 9.2);
        System.out.println(map);

        Student student4 = new Student("Stanislav", "Yashnov", 3);
        Student student5 = new Student("Igor", "Sidorov", 4);
//        boolean result = map.containsKey(student4);
//        System.out.println("result = " + result);
        System.out.println(student.hashCode());
        System.out.println(student5.hashCode());
        for(Map.Entry<Student, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
class Student{
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, surname, course);
//    }
//    @Override
//    public int hashCode() {
//       return name.length() * 7 + surname.length() * 11 + course * 53;
//    }

    String name;
    String surname;
    int course;
}
