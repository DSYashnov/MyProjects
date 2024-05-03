package les22.homework;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName(new StringBuilder("Stas"));
        student.setCourse(4);
        student.setGrade(6);
        student.showInfo();

    }
}
