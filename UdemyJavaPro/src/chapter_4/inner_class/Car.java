package chapter_4.inner_class;

public class Car {
    public Car(String color, int dorCount) {
//        this.engine = this.new Engine(horsePower);
        this.color = color;
        this.dorCount = dorCount;
    }
    public void setEngine(Engine engine){
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


    public  class Engine {
        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
        int horsePower;
    }
}
class Test{
    public static void main(String[] args) {
        Car car = new Car("red", 3);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);

//       Car.Engine engine2 = car.new Engine(150);
        Car.Engine engine2 = new Car("yellow", 4).new Engine(150);
        System.out.println(engine2);

    }
}


