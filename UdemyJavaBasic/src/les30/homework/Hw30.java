package les30.homework;


import java.util.ArrayList;

public class Hw30 {

}
class Employee{
    String name;
    String department;
    double salary;
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
class TestEmployee{
    void filterEmployee(ArrayList<Employee> emp, Predicate p){
        for(Employee e : emp){
            if(p.test(e)){
                System.out.println("Employee name: " + e.name + ", Employee department: "  + e.department + ", Employee salary: " + e.salary);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Mike", "IT", 500.0));
        emp.add(new Employee("Eva", "Female", 650.0));
        emp.add(new Employee("Tesla", "Tesla", 200.0));
        emp.add(new Employee("John", "MD", 120.0));
        emp.add(new Employee("Stanislav", "IT", 900.0));
        emp.add(new Employee("Edvard", "MD", 450.0));


        TestEmployee e1 = new TestEmployee();
        e1.filterEmployee(emp, e -> e.department.equals("IT") && e.salary > 200);
        e1.filterEmployee(emp, e -> e.name.startsWith("E") && e.salary != 450);
        e1.filterEmployee(emp, e -> e.name.equals(e.department));

    }
}
interface Predicate{
    boolean test(Employee e);
}