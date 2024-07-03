package chapter_8.FileStream.serialization.programmer1;

import java.io.Serializable;

public class Employees implements Serializable {
    static final long serialVersionUID = 2;
    public Employees(String name, String surname, String department, int age, double salary, Car car) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }

    String name;
    String surname;
    String department;
    int age;
    transient double salary;
    Car car;
}
