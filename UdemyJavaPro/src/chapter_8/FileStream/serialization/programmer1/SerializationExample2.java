package chapter_8.FileStream.serialization.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample2 {
    public static void main(String[] args) {
        Car car = new Car("Nissan Tida", "White");
        Employees employees = new Employees("Sarach", "Konor", "IT", 29, 87438, car);
        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("employees.bin")
        )) {
            oos.writeObject(employees);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}