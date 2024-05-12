package les28.test14;
import java.io.*;
public class Test14 {
    static FileInputStream fis1, fis2;

    public static void main(String[] args) {
        try{
            fis1 = new FileInputStream("test10.txt");
            System.out.println("file test10 in system");
            try{
                fis2.close();
            } catch(IOException e){
                System.out.println("problem in stream fis2");
            }
        }
        catch(FileNotFoundException e){
            System.out.println("file test10 is not found");
        } catch (NullPointerException e){
            System.out.println("NullPointerException is activated");
        }
    }
}
