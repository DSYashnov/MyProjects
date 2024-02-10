package lec8;

public class MassArray {
    public static void main(String[] args) {
        char[][] array = new char[2][2];
        array[0][0] = 't';
        System.out.println(array[0][0]);


        byte[][] nums = new byte[][]{
                {5, 8},
                {4, 3},
        };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++)
                System.out.println(nums[i][j]);

        }
    }
}
