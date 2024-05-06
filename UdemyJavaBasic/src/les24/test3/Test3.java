package les24.test3;



public class Test3 {
    public static void main(String[] args) {
        HelpAble h = new Driver();
        SwimAble s = new Driver();
        Employee e = new Driver();
        System.out.println(h.a);
        h.fire("voda");
        h.help();
        s.swim();
    }

}
    class Employee{
        double salary = 100;
        String name = "Stanislav";
        int age;
        int experience;
        void eat(){
            System.out.println("Eat");
        }
        void sleep(){
            System.out.println("Sleep");
        }
    }
    class Teacher extends Employee implements HelpAble {
        @Override
        public void help() {
            System.out.println("Teacher add help");
        }
        @Override
        public void fire(String s) {
            System.out.println("Teacher add fire" + s);
        }

        void talk() {
            System.out.println("Talk");
        }
    }
    class Driver extends Employee implements HelpAble, SwimAble {
        String carName;
        void driver(){
            System.out.println("Driver");
        }
        @Override
        public void help() {
            System.out.println("Driver add help");
        }
        @Override
        public void fire(String s) {
            System.out.println("Driver add fire " + s);
        }
        @Override
        public void swim() {
            System.out.println("Driver add swim");
        }
    }
    interface HelpAble{
        int a = 10;
        void help();
        void fire(String predmet);
    }
    interface SwimAble{
        void swim();
    }
    abstract class Y implements HelpAble{

    }
    abstract class A extends Y{

    }
    class B extends Y{
    public void help(){
    }
    public void fire(String s) {
    }
}

