package chapter_3.hashtable;


import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Double, Student> hashTable = new Hashtable<Double, Student>();
        Student student = new Student("Stanislav", "Yashnov", 3);
        Student student1 = new Student("Mariya", "Huorova", 1);
        Student student2 = new Student("Anna", "Avramenko", 4);
        Student student3 = new Student("Stanislav","Yashnov", 3);

        hashTable.put(6.6, student);
        hashTable.put(7.8, student1);
        hashTable.put(9.3, student2);
        hashTable.put(8.9, student3);

        System.out.println(hashTable);

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