package chapter_4.static_nested_class;

import org.w3c.dom.ls.LSOutput;

public class Car {
    public Car(String color, int dorCount, Engine engine) {
        this.color = color;
        this.dorCount = dorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car{" +
                "color='" + color + '\'' +
                ", dorCount=" + dorCount +
                ", engine=" + engine +
                '}';
    }

    String color;
    int dorCount;
    Engine engine;
    static int a;

    void method(){
        System.out.println(Engine.countOfObj);
    }

    public static class Engine {
        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
        static int countOfObj = 0;
        int horsePower;
    }
}
class Test{
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine.toString());
        Car car = new Car("red", 2, engine);
        System.out.println(car);
    }
}
class X extends Car.Engine{
    X() {
        super(200);
    }
}