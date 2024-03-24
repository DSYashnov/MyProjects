package les6;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int [] array = new int[] {
            10, 20,15, 107, 56, 15
        };
        int sumOfDigits = 0;

        // Проходимо по кожному числу в масиві
        for (int num : array) {
            // Розбиваємо число на окремі цифри та знаходимо їх суму
            while (num != 0){
                sumOfDigits += num % 10;//Додаємо останню цифру числа до суми
                num /= 10; // Видаляємо останню цифру числа
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Сума всії цифр масиву: " + sumOfDigits);
    }
}
