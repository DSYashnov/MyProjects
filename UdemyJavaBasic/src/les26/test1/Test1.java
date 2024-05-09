package les26.test1;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("Red", "V4");
        Car c2 = new Car("Red", "V4");
        Car c3 = new Car("Black", "V8");
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        Car c4 = new Car("Black", "V8");
        System.out.println(c3);
    }
}
class Car{
    String color;
    String engine;

    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
    }
    public boolean equals(Object obj){
        if(obj instanceof Car){
            Car c2 = (Car)obj;
            return (color.equals(c2.color) && engine.equals(c2.engine));
        } else {
            return false;
        }
    }
    public String toString(){
        return "Mashina cveta " + color + " i s motorom " + engine;
    }
}
