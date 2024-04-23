package les18;

public class ArrTest2 {
    public static void main(String[] args) {
        String[] arr1;
        int[][] arr2;

        arr1 = new String[3];
        arr2 = new int[3][];

        for (int i = 0; i < arr1.length; i++){
            arr1[i] = "privet" + i;
            System.out.println(arr1[i]);
        }

        arr2[0] = new int [5];
        arr2[1] = new int [2];
        arr2[2] = new int [7];

        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2[i].length; j++){
                arr2[i][j] = i + j;
                System.out.println(arr2[i][j]);
            }
        }
    }
}
