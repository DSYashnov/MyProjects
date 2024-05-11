package workLearn.Test7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test7 {
    public static void main(String[] args) {
        StringBuilder result  =  new StringBuilder("");
        try {
            File f = new File("test9.txt");
            System.out.println("Object file add");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Stream add");
            int count = 0;
            while(true){
                count++;
                result.append(fis.read());
                System.out.println("Inf is read");
                if(count == 3){
                    fis.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ex 1");
        } catch (IOException e) {
            System.out.println("Ex 2");
        } finally {
            System.out.println("this is finally");
        }
    }
}
