package les12.homework;

public class StudentTest {
    public static void methodOne(Student s1, Student s2) {
        if (s1.name.equals(s2) && s1.id == s2.id && s1.course == s2.course) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Студенты не равны");
        }
    }

    public static void methodTwo(Student s1, Student s2) {
        if (s1.name.equals(s2.name)) {
            if (s1.id == s2.id) {
                if (s1.course == s2.course) {
                    System.out.println("Имена студентов, курсы и оценки одинаковы");
                } else {
                    System.out.println("Имена студентов и курсы одинаковые, но оценки различаются");
                }
            } else {
                System.out.println("Имена студентов одинаковые, но курсы различаются");
            }
        } else {
            System.out.println("Имена студентов различаются");
        }
    }


    public static void main(String[] args) {
        Student s1 = new Student(1, "Stanislav", 4);
        Student s2 = new Student(2, "Max", 4);

        methodOne(s1, s2);
        methodTwo(s1, s2);
    }
}
