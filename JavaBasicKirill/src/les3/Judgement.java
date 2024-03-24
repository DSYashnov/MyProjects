package les3;

import java.util.Scanner;

public class Judgement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter judgement on a 12-point scale: ");
        int judgement = s.nextInt();

        if (judgement == 12 || judgement == 11 || judgement == 10){
            System.out.println("Your judgement: " + 5);
        } else if (judgement == 9 || judgement == 8 || judgement == 7) {
            System.out.println("Your judgement: " + 4);
        } else if (judgement == 6 || judgement == 5 || judgement == 4) {
            System.out.println("Your judgement: " + 3);
        } else if (judgement == 3 || judgement == 2 || judgement == 1) {
            System.out.println("Your judgement: " + 2);
        } else {
            System.out.println("Incorrect value");
        }
    }
}
