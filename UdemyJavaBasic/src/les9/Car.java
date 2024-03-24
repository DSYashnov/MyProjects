package les9;

public class Car {
    String color;
    String engine;
    static int count;

    Car (String color, String engine){
        count++;
        this.color = color;
        this.engine = engine;
    }
    public void showColor(){
        System.out.println(" Color car: " + color);
    }
    public void changeColor(String color){
        System.out.println("Color car is new");
        int cena = 5000;
        this.color = color;
        cena += 1000;
    }
}
