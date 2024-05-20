package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        Employee emp1 = new Employee(100, "Stanislav", "Yashnov", 1274);
        Employee emp2 = new Employee(101, "Sarah", "Yashnov", 1274);
        Employee emp3 = new Employee(102, "Sarah", "Yashnov", 1274);
        list.add  (emp1);
        list.add  (emp2);
        list.add  (emp3);
        System.out.println("before sort\n" + list);
        Collections.sort();
    }

}
class Employee implements Comparable<Employee>{
    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    int id;
    String name;
    String surname;
    int salary;

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
