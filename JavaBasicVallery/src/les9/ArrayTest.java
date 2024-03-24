package les9;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayTest {

    public static void swap(int[] array, int ind1, int ind2){
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
    public static void main(String[] args) {
        Random random = new Random();
        Scanner s = new Scanner(System.in);

        int[] array1 = new int[7];
        for (int i = 0; i < 7; i++) {
            array1[i] = random.nextInt(9) + 1;
            }

        for (int left = 0; left < array1.length; left++){
            int minInd = left;
            for (int i = left; i < array1.length; i++){
                if (array1[i] < array1[minInd]){
                    minInd = i;
                }
            }
            swap(array1, left, minInd);
        }
        int[] array2 = new int[7];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Введите значения: ");
            array2[i] = s.nextInt();
        }
        for (int right = 0; right < array2.length; right++){
            int minInd = right;
            for (int i = right; i < array2.length; i++){
                if (array2[i] < array2[minInd]){
                    minInd = i;
                }
            }
            swap(array2, right, minInd);
        }
        int temp = 0;
        if (array1[0] == array2[0]){
            temp++;
        } else if (array1[1] == array2[1]) {
            temp++;
        } else if (array1[2] == array2[2]) {
            temp++;
        } else if (array1[3] == array2[3]) {
            temp++;
        } else if (array1[4] == array2[4]) {
            temp++;
        } else if (array1[5] == array2[5]) {
            temp++;
        } else if (array1[6] == array2[6]) {
            temp++;
        } else {
            System.out.println("Совпадений не найдено");
        }
        System.out.println("Вы ввели значения: ");
        System.out.println(Arrays.toString(array2));
        System.out.println("Комп'ютер загадал значения: ");
        System.out.println(Arrays.toString(array1));
        System.out.println("Количество совпадений: " + temp);
    }


}


