package les12;

public class Car {
    int engine;
    int doorCount;

    Car(int engine, int doorCount){
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car(1, 4);
        Car c2 = new Car( 2, 5);

        if (c1.engine > c2.engine){
            if (c1.doorCount > c2.doorCount){
                System.out.println("Moshnost motora i kol-vo dverei u pervoy mashoni bolshe");
            } else {
                System.out.println("Moshnost motora u pervoy mashini bolshe? a kol-vo dverey menshe");
                 }
            } else {
                System.out.println("Moshnost motora u pervou mashini menshe");
        }
    }
}
