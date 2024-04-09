package les16;

class Test3 {

}
class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee(100.5, true);
        System.out.println(e.isManager + " " + e.salary);
    }
}
    class Employee {
        double salary;
        boolean isManager;

        Employee(double salary, boolean isManager) {
            this.isManager = isManager;
            this.salary = salary;
        }
    }






