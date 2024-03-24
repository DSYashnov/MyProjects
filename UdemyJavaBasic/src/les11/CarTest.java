package les11;

public class CarTest {
    public static void firstMesthod(Car d1, int dorCount){
        d1.dor = dorCount;
    }
    public static void lastMethod(Car col1, Car col2){
        String color = col1.color;
        col1.color = col2.color;
        col2.color = color;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Vhite", "V8", 4);
        Car car2 = new Car("Blue", "V10", 3);
        firstMesthod(car1, 5);
        System.out.println(car1.dor);
        lastMethod(car1, car2);
    }
}
