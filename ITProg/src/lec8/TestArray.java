package lec8;

public class TestArray {
    public static void main(String[] args) {
        // Array date
        int[] numbs = new int[5];
        numbs[0] = 45;
        numbs[1] = 32;
        numbs[2] = 1;
        numbs[3] = 9;
        numbs[4] = 3;
        int res = numbs[2] + numbs[3];
        System.out.println(res);

        float[] numbs2 = new float[]{5.0f, 6.45f, 89.984f};
        System.out.println(numbs2[2]);

        for (int i = 0; i < numbs2.length; i++){
            System.out.println("element: " + numbs2[i]);
        }
    }
}
