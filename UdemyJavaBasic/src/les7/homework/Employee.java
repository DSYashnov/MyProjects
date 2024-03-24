package les7.homework;

public class Employee {
    private double salary;
    public String surname;
    int id;

    public Employee (double salary1, String surname1, int id1){
        salary = salary1;
        surname = surname1;
        id = id1;
    }
    private Employee (String surname2, int id2) {
        surname = surname2;
        id = id2;
    }
    Employee (int id3, String surname3){
        id = id3;
        surname = surname3;
    }
}
