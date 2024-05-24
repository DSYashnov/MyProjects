package chapter_2.example;

public class Main {
    public static void main(String[] args) {
        Schoolar sc1 = new Schoolar("Petr", 13);
        Schoolar sc2 = new Schoolar("Ivan", 15);

        Student st1 = new Student("Bogdan", 20);
        Student st2 = new Student("Stanislav", 29);

        Employee emp1 = new Employee("Volodya", 35);
        Employee emp2 = new Employee("Alex", 40);

        Team<Schoolar> schoolarTeam = new Team<>("Dragons");
        schoolarTeam.addNewParticipant(sc1);
        schoolarTeam.addNewParticipant(sc2);

        Team<Student> studentTeam = new Team<>("GO");
        studentTeam.addNewParticipant(st1);
        studentTeam.addNewParticipant(st2);

        Team<Employee> employeeTeam = new Team<>("Old");
        employeeTeam.addNewParticipant(emp1);
        employeeTeam.addNewParticipant(emp2);

        Team<Schoolar> schoolarTeam1 = new Team<>("Gendalf");
        Schoolar sc3 = new Schoolar("Sergey", 12);
        Schoolar sc4 = new Schoolar("Olga", 14);
        schoolarTeam1.addNewParticipant(sc3);
        schoolarTeam1.addNewParticipant(sc4);
        schoolarTeam.playWith(schoolarTeam1);


    }
}
