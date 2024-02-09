package lec8;

import java.util.Scanner;

public class StartArray {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter value: ");
            int value = s.nextInt();
            arr[i] = value;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Minimal value: " + min);
    }
}

