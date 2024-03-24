package les2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите свой рост: ");
        float height = s.nextFloat();
        System.out.print("Введите свой вес: ");
        float weight = s.nextFloat();

        float res = weight / (height * height);
        System.out.println("Ваш ИМТ: " + res);

        if (res < 18.5) {
            System.out.println("Дефицит массы тела");
        } else if (res >= 18.5 && res <= 24.9) {
            System.out.println("Нормальная масса тела");
        } else if (res >= 25.0 && res <= 29.9) {
            System.out.println("Избыточная масса тела (предожирение)");
        } else if (res >= 30.0 && res <= 34.9) {
            System.out.println("Ожирение I степени");
        } else if (res >= 35.0 && res <= 39.9) {
        System.out.println("Ожирение II степени");
        } else if (res >= 40) {
        System.out.println("Ожирение III степени");
        }
    }
}
