package les19;

import javax.swing.*;

public class Test9 {
    public static void main(String[] args) {
        int[] arr1 = {3, 1, -2, 0};
        int[] arr2 = {-9, 1, 5, 2};
        for(int i = 0; i < arr1.length && i < arr2.length; i++){
            arr1[i] = 12;
            arr2[i] = 3;
        }
        for (int a : arr2){
            for(int b : arr1){
                System.out.println(arr1[a] + arr2[b]);
            }
        }
    }
}
