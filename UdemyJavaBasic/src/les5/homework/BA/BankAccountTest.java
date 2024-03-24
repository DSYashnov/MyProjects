package les5.homework.BA;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bA = new BankAccount();
        bA.id = 1;
        bA.name = "Stanislav";
        bA.balance = 56456.546;

        bA.info();
        bA.snyatieSoScheta(1000);
        bA.info();

    }
}
