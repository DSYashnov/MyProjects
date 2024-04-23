package les18;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr1;
        String[] arr2;
        double[][] arr3;
        double[] arr7;

        arr1 = new int[8];
        arr2 = new String[3];
        arr3 = new double[4][2];
        arr7 = new double[2];

        arr2[0] = "privet";
        arr2[1] = "poka";
        arr2[2] = "ok";

        arr3[0][0] = 3.14;
        arr3[2][1] = 3.14;

        double[] array5 = new double[2];
        array5[0] = 2.5;
        array5[1] = 3.5;
        arr7 = array5;

        arr3[1] = array5;



        System.out.println(arr3[1][0]);

    }

}
