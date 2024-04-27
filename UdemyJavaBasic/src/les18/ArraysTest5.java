package les18;

public class ArraysTest5 {
    public static void main(String[] args) {
        int arr1[] = {1, 9, 3, -8, 0, 5, 4, 1};
        int arr2[] = {1, 9, 3, -8, 0, 5, 4, 1};
        int arr3[] = arr2;
        arr1[1] = 0;
        arr2[5-3] = 3;
        arr1[arr1.length] = 10;

        //System.out.println(arr3==arr2);

        System.out.println(arr3.equals(arr2));
    }
}
