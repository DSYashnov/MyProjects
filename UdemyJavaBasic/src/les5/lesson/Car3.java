package les5.lesson;

public class Car3 {
    Car3(String cvet, String motor){
        color = motor;
        engine = cvet;
        System.out.println("Cvet mashiny: " + color + " motor mashiny: " + engine);
    }
    String color;
    String engine;
}

class CarTest{
    public static void main(String[] args) {
        Car3 car1 = new Car3("Black", "V8");

    }
}
