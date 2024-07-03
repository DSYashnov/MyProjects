package chapter_8.FileStream.serialization.programmer2;

import chapter_8.FileStream.serialization.programmer1.Employees;

import java.io.*;

public class SerializationExample2 {
    public static void main(String[] args) {
        Employees emp;
        try(ObjectInputStream oos = new ObjectInputStream(
                new FileInputStream("employees.bin")
        )){
        emp = (Employees) oos.readObject();
            System.out.println(emp);
    } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
