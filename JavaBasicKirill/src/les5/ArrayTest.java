package les5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите длинну массива: ");
        int lengthArray = s.nextInt();
        int[] array = new int[lengthArray];


        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(lengthArray) + 1;
        }
        int count = 0;
        for (int num : array){
            count += num;
        }
        double average = (double) count / array.length;
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min) {
                min = array[i];
            }
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Минимальное число массива: " + min);
        System.out.println("Максимальное число массива: " + max);
        System.out.println("Среднее арифметическое чисел массива: " + average);
    }
}
