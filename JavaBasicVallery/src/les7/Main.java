package les7;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = (int) (Math.random() * 10);
        boolean trueFalse = true;
        int value = a;
        int valueAttempt = 3;

        while (trueFalse){
            System.out.print("Угадайте загаданное число: ");
            int attempt = s.nextInt();
            if (attempt == value){
                System.out.print("Вы угадали, загаданное число - " + a);
                break;
            }else{
                System.out.print("Вы не угадали, повторите попытку\n");
            }
            valueAttempt --;
            if (valueAttempt == 0){
                break;
            }
    }


    }
}
