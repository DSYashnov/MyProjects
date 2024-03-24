package les5.homework.BA;

public class BankAccount {
    int id;
    String name;
    double balance;

    double popolnenieScheta(double a) {
        balance += a;
        return balance;
    }
    double snyatieSoScheta(double b){
        balance -= b;
        return balance;
    }
    void info(){
        System.out.println("Id: " + id + "\nclient: " + name + "\nbalance client: " + balance);
    }
}
