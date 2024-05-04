package les23.test2;

public class Test2 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.eat();
        Teacher teacher = new Teacher();
        teacher.eat();
    }
}
    class Fod{

    }
    class Fruits extends Fod{

    }
    class Employee {
        double salary;
        String name;
        int age;
        int experience;
        private int a = 5;

        Fod eat() {
            System.out.println("Eat employee");
            Fod f = new Fod();
            return f;
        }

        void sleep() {
            System.out.println("Sleep");
        }
    }

    class Teacher extends Employee {
        void talk() {
            System.out.println("Talk");
        }
        Fruits eat() {
            System.out.println("Eat teacher");
            Fruits f = new Fruits();
            return f;
        }
    }


