package les23.test5;

public class Test5 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.sleep();
        System.out.println(teacher.salary);

        Employee employee = new Teacher();
        employee.sleep();
    }
}
    class Fod {

    }

    class Fruits extends Fod {

    }

    class Employee {
        double salary;
        String name;
        int age;
        int experience;
        private int a = 5;

        final Fod eat() {
            System.out.println("Eat employee");
            Fod f = new Fod();
            return f;
        }

        final static void sleep() {
            System.out.println("Sleep employee");
        }
    }

    class Teacher extends Employee {
    double salary = 200;
        void talk() {
            System.out.println("Talk");
        }
//        public Fruits eat() {
//            System.out.println("Eat teacher");
//            Fruits f = new Fruits();
//            return f;
//        }
//        static void sleep() {
//            System.out.println("Sleep teacher");
//        }
    }
    class T {

    }
    class P extends T {

    }


