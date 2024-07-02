package work.chapter_8.serialization.programmer1;

import java.io.Serializable;

public class Car implements Serializable {
    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    String model;
    String color;
}
