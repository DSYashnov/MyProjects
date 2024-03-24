package les3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите длинну стороны a: ");
        int a = s.nextInt();
        System.out.print("Введите длинну стороны a: ");
        int b = s.nextInt();
        System.out.print("Введите длинну стороны a: ");
        int c = s.nextInt();

        int length = (a + b + c) * 4;
        int volume = a * b * c;
        System.out.println("Об'єм паралелепипеду = " + volume);
        System.out.println("Сумарна довжина всіх сторін = " + length);
    }
}
