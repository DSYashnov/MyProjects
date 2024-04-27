package les19;

public class Test5 {
    public static void main(String[] args) {
        String [] students = {"Ivanov", "Petrov", "Sidorov"};
        String [] exam = {"Math", "filosophia"};

        for (String s1 : students){
            for (String s2 : exam){
                System.out.println(s1 + " " + s2);
            }
        }
    }
}
