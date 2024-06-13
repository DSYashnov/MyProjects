package chapter_6.streams.flatMap;

import java.util.ArrayList;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathematics");
        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream()).forEach(e-> System.out.println(e.getName()));

    }
}
class Faculty {
    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    String name;
    List<Student> studentsOnFaculty = new ArrayList<>();

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }
    public void addStudentToFaculty(Student student) {
        studentsOnFaculty.add(student);
    }
}

