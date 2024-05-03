package les22.homework;

public class Student {
    public void showInfo(){
        System.out.println(getName());
        System.out.println(getCourse());
        System.out.println(getGrade());
    }
    public StringBuilder getName() {
        return name;
    }
    public void setName(StringBuilder name) {
        if(name.length() < 3){
            return;
        }
        this.name = name;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        if(course < 1 || course > 4){
            return;
        }
        this.course = course;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        if (grade < 1 || grade > 10) {
            return;
        }
        this.grade = grade;
    }
    private StringBuilder name;
    private int course;
    private double grade;
}

