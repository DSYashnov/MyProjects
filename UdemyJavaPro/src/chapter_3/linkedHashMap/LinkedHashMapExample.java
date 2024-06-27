package chapter_3.linkedHashMap;


import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>(16, 0.75f, true);
        Student student = new Student("Stanislav", "Yashnov", 3);
        Student student1 = new Student("Mariya", "Huorova", 1);
        Student student2 = new Student("Anna", "Avramenko", 4);
        Student student3 = new Student("Stanislav","Yashnov", 3);

        lhm.put(5.8, student);
        lhm.put(6.4, student1);
        lhm.put(7.2, student2);
        lhm.put(7.5, student3);
        System.out.println(lhm);

        System.out.println(lhm.get(6.4));
        System.out.println(lhm.get(7.5));

        System.out.println(lhm);
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
