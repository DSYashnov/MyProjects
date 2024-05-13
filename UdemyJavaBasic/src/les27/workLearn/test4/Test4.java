package les27.workLearn.test4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test4 {
    void abc() throws FileNotFoundException {
        File f = new File("Test8.txt");
            FileInputStream fis = new FileInputStream(f);
        int [] arr = {2, 1};
            System.out.println(arr[5]);
    }

    void def() throws FileNotFoundException {
        abc();
    }

    public static void main(String[] args) {
        Test4 t4 = new Test4();
        try{
            t4.def();
        } catch (FileNotFoundException  e) {
            IOException f = e;
            System.out.println("Exception poiman: " + e);
            //e.printStackTrace();
        }
        }
}
