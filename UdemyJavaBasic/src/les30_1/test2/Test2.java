package les30_1.test2;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;
public class Test2 {
}
class Car{
    String color;
    String model;
    double engine;

    Car(String color, String model, double engine){
        this.color = color;
        this.model = model;
        this.engine = engine;
    }
    public String toString(){
        return "color: " + color + ", model: " + model + ", engine: " + engine;
    }
}
class Test3 {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cars.add(carSupplier.get());
        }
        return cars;
    }
//    public static void changeCar(Car car, Car Consumer<Car> consumer){
//        .accept(car);


    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Silver", "Nissan", 1.6));
        System.out.println("ourCars: " + ourCars);
    }
}
