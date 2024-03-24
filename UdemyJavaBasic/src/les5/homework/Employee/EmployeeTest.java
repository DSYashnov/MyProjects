package les5.homework.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Stanislav", 29, 5000, "Java department");
        e1.doubleSalary();

        Employee e2 = new Employee(2, "Stanislav", 29, 10000, "Java department");
        e1.doubleSalary();
    }
}
