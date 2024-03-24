package les4;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.mathRating = 5.0;
        student1.economicRating = 4.4;
        student1.languageRating = 4.6;

        Student student2 = new Student();
        student2.mathRating = 4.0;
        student2.economicRating = 4.8;
        student2.languageRating = 3.6;

        Student student3 = new Student();
        student3.mathRating = 4.3;
        student3.economicRating = 5.0;
        student3.languageRating = 3.3;

        System.out.println("Средняя оценка студента 1 по математике: " + student1.mathRating);
        System.out.println("Средняя оценка студента 1 по экономике: " + student1.economicRating);
        System.out.println("Средняя оценка студента 1 по иностранным языкам: " + student1.languageRating);
        System.out.println();
        System.out.println("Средняя оценка студента 2 по математике: " + student2.mathRating);
        System.out.println("Средняя оценка студента 2 по экономике: " + student2.economicRating);
        System.out.println("Средняя оценка студента 2 по математике: " + student2.languageRating);
        System.out.println();
        System.out.println("Средняя оценка студента 3 по математике: " + student3.mathRating);
        System.out.println("Средняя оценка студента 3 по экономике: " + student3.economicRating);
        System.out.println("Средняя оценка студента 3 по иностранным языкам: " + student3.languageRating);

        Student sTest = new Student();
        sTest.studentRating(student1);
        sTest.studentRating(student2);
        sTest.studentRating(student3);

    }
}
