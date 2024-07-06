package chapter_9.regularExpressions;

public class PrintfExample {

    static void employeeInfo(Employee emp) {
        System.out.printf("%03d \t %-12s \t %-12s \t %,.1f \n", emp.id, emp.name, emp.surname, emp.salary*(1+emp.bonus));

    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Stanislav", "Yashnov", 12345, 0.15);
        Employee emp2 = new Employee(15, "Mary", "Bob", 98765, 0.8);
        Employee emp3 = new Employee(123, "John", "Smith", 4522, 0.12);

        employeeInfo(emp1);
        employeeInfo(emp2);
        employeeInfo(emp3);


        String newString = String.format("%03d \t %-12s \t %-12s \t %,.1f \n", 1, "Stanislav", "Yashnov", 21872*(1+0.15));
        System.out.println(newString);
    }
}

class Employee {
    public Employee(int id, String name, String surname, int salary, double bonus) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonus = bonus;
    }

    int id;
    String name;
    String surname;
    int salary;
    double bonus;
}
