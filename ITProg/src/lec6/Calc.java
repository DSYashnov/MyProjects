package lec6;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first value: ");
        int num1 = s.nextInt();

        System.out.print("Enter second value: ");
        int num2 = s.nextInt();

        int res;

        System.out.println("Verb: ");
        String action = s.nextLine();
        action = s.nextLine();

        switch (action){
            case "+":
                res = num1 + num2;
                System.out.println("Result: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Result: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Result: " + res);
                break;
            case "/":
                if (num2 == 0){
                    System.out.println("Error");
                } else {
                    res = num1 / num2;
                    System.out.println("Result: " + res);
                }
                break;
            default:
                System.out.println("Enter correct value");
        }
    }
}
