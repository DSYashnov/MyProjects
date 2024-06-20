package chapter_5.consumer;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class ConsumerExample {
        public static ArrayList<Car> createThreeCars (Supplier<Car> supplier){
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cars.add(supplier.get());
        }
        return cars;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
            carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() ->
                new Car("Nussan Tida", "black", 1.6));
        System.out.println("Our cars: " + ourCars);

        changeCar(ourCars.get(0),
                car -> {car.color = "red";
                        car.engine = 2.5;
        System.out.println("upgrading car: " + car);});
        System.out.println(ourCars);
    }
}
class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}

