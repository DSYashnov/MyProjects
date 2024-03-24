package les5.lesson;

public class Human {
    String name;
    Car3 car;
    BankAccount bA;
    void info(){
        System.out.println("Name: " + name + "Color car: " + car.color + " Balance: " + bA.balance);
    }

}

class HumanTest{
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "David";
        h.car = new Car3("Red", "V6");
        h.bA = new BankAccount(1, 2000);
        h.info();
    }
}

class  Car4 {
    Car4(String c, String e){
        color = c;
        engine = e;
    }
    String color;
    String engine;
}

class BankAccount {
    BankAccount(int id2, double balance2){
        id = id2;
        balance = balance2;
    }
    int id;
    double balance;
}
