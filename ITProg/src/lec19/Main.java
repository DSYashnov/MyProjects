package lec19;
import lec19.Transport;
import lec19.db.DB;
public class Main {
    public static void main(String[] args) {
        Car bmw = new Car();

        bmw.setLight(true);
        bmw.blinkLight();
    }
}
