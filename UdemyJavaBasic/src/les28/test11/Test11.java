package les28.test11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test11 {
    FileInputStream fis1, fis2;
    public void abc(){
        try {
            fis1 = new FileInputStream("test10.txt");
            try{
                fis2 = new FileInputStream("test11.txt");
            } catch (FileNotFoundException e){
                System.out.println("File test11.txt not found");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File test10.txt not found");
        }
        finally {
            System.out.println("this is vneshniy finally block");
            try{
                fis1.close();
                fis2.close();
            } catch (IOException e) {
                System.out.println("Naiden exception is finally block");
            }
        }
    }

public static void main(String[] args) {
    Test11 t = new Test11();
    t.abc();
    }
}
