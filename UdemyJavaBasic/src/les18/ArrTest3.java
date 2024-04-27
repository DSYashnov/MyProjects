package les18;

import java.util.Arrays;

public class ArrTest3 {
    public static void main(String[] args) {
        int arr1[] = {1, 9, 3, -8, 0, 5, 4, 1};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        int indeex1 = Arrays.binarySearch(arr1, 2);
        System.out.println(indeex1);
    }
}
