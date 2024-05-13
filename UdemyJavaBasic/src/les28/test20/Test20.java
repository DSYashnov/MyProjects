package les28.test20;

import java.io.FileNotFoundException;

public class Test20 {
    static void abc() {
        System.out.println("ok");
    }

    public static void main(String[] args) {
        try{
            abc();
        } catch (ArrayIndexOutOfBoundsException e){

        }
    }
}
