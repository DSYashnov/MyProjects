package chapter_8.FileStream.serialization.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationExample1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<String>();
        employees.add("John Doe");
        employees.add("Jane March");
        employees.add("Jim Dick");
        employees.add("Sam Rami");

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("employees.bin"))
        ) {
            oos.writeObject(employees);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
