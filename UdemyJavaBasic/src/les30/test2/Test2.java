package les30.test2;

import java.util.ArrayList;

public class Test2 {

}
class Student{
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}
class StudentInfo{
    void printStudent(Student s){
        System.out.println("Students name: " + s.name + ", sex: " + s.sex + ", age: " + s.age + ", course: " + s.course + ", avgGrade: " + s.avgGrade);
    }
    void testStudents(ArrayList<Student> aL, StudentsChecks sc){
        for(Student s : aL){
            if(sc.testStudent(s)){
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo si = new StudentInfo();
        FindStudentsOverGrade fogs = new FindStudentsOverGrade();
        FindStudentsUnderAge fugs = new FindStudentsUnderAge();
        FindStudentsUnderGrade fsug = new FindStudentsUnderGrade();
        FindStudentsUnderAge fsua = new FindStudentsUnderAge();
        FindStudentsBySex fsbs = new FindStudentsBySex();
        FindStudentsMixCondition fsmc = new FindStudentsMixCondition();

        si.testStudents(list, fogs);
        System.out.println("----------------------------------------------");
        si.testStudents(list, fugs);
        System.out.println("----------------------------------------------");
        si.testStudents(list, fsug);
        System.out.println("----------------------------------------------");
        si.testStudents(list, fsua);
        System.out.println("----------------------------------------------");
        si.testStudents(list, fsbs);
        System.out.println("----------------------------------------------");
        si.testStudents(list, fsmc);

    }
}
interface StudentsChecks{
    boolean testStudent(Student s);
}
class FindStudentsOverGrade implements StudentsChecks{
    public boolean testStudent(Student s){
        return s.avgGrade > 8.5;
    }
}
class FindStudentsUnderGrade implements StudentsChecks{
    public boolean testStudent(Student s){
        return s.avgGrade < 9;
    }
}
class FindStudentsOverAge implements StudentsChecks{
    public boolean testStudent(Student s){
        return s.age > 25;
    }
}
class FindStudentsUnderAge implements StudentsChecks{
    public boolean testStudent(Student s){
        return s.age < 27;
    }
}
class FindStudentsBySex implements StudentsChecks{
    public boolean testStudent(Student s){
        return s.sex == 'm';
    }
}
class FindStudentsMixCondition implements StudentsChecks{
    public boolean testStudent(Student s){
        return (s.avgGrade > 7.2 && s.age < 23 && s.sex == 'f');
    }
}