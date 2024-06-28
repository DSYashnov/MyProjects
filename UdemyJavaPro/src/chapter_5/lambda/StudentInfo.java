package chapter_5.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentInfo {
    void testStudents(ArrayList<Student> al, StudentChecks sc){
        for(Student s : al){
            if (sc.checkStudent(s)){
                System.out.println(s);
            }
        }
}
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo inst = new StudentInfo();
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return st1.course-st2.course;
//            }
//        });
        Collections.sort(students, (stud1, stud2) -> stud1.course-stud2.course);
        System.out.println(students);


//        inst.testStudents(students, (Student s)-> {return s.avgGrade < 8;});
//        inst.testStudents(students, s -> s.avgGrade < 8);
//
//        inst.testStudents(students, s -> {return s.avgGrade < 8;});
//
//        inst.testStudents(students, (Student s)-> s.avgGrade < 8);
//
//        StudentChecks sc = (Student s)-> {return s.avgGrade < 8;};
//        inst.testStudents(students, sc);
//
//        System.out.println("------------------");
//
//        inst.testStudents(students, (Student s)-> {return s.age < 30;});
//        System.out.println("------------------");
//        inst.testStudents(students, (Student s)-> {return s.age > 20 && s.avgGrade > 9.3 && s.sex == 'f';});


    }
interface StudentChecks {
    boolean checkStudent(Student s);
}
class CheckOverGrade implements StudentChecks{
    @Override
    public boolean checkStudent(Student s) {
        return s.avgGrade > 8;
    }
    }
}