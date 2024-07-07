package chapter_10.scanner;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter value");
//        int i = sc.nextInt();
//        System.out.println("vvedennoe chislo: " + i);

//        System.out.println("enter two value");
//        int j = sc.nextInt();
//        int k = sc.nextInt();
//        System.out.println("Chastnoe = " + j/k);
//        System.out.println("Ostatok = " + j%k);

//        System.out.println("Napishite stroky");
//        String s = sc.next();
//        System.out.println("vy napisali: " + s);

//        System.out.println("Enter double value");
//        double d = sc.nextDouble();
//        System.out.println("vvedennoe chislo: " + d);

        Scanner sc = new Scanner("hello my friend\nHow are you?\nwhen us go drinking beer");
//        String s = sc.nextLine();
//        System.out.println(s);
//        System.out.println(sc.nextLine());
//        System.out.println(sc.nextLine());
//        while(sc.hasNextLine()) {
//            System.out.println(sc.nextLine());
        System.out.println(sc.next().charAt(2));
        }
    }

