package les28.test19;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test19 {
    public static void main(String[] args) {
        //Animal animal = new Mouse();
    }
}
class Animal {
    Animal() throws FileNotFoundException, IndexOutOfBoundsException {

    }
}
class Mouse extends Animal {
    Mouse() throws Exception, IOException {
        super();
    }
}
class Human{
    String name;
    int age;
    Human(String name, int age) throws Exception {
        if (age < 0){
            throw new Exception("incorrect age");
        }
        this.name = name;
        this.age = age;
    }
}