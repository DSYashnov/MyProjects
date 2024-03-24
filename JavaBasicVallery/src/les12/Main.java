package les12;

public class Main  {
    public static void main(String[] args) {
        Tracker user1 = new Tracker("Stanislav", 1994, 10, 3, "s.yashnov@gmail.com", "+380634939107");
        user1.setLastName("Yashnov");
        user1.setWeight(75);
        user1.setPressure("140/70");
        user1.setStep(5000);

        user1.printAccountInfo();
    }
}
