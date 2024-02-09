package lec8;

public class MassArray {
    public static void main(String[] args) {
        char[][] array = new char[2][2];
        array[0][0] = 't';
        System.out.println(array[0][0]);


        byte[][] nums = new byte[][]{
                {5, 8},
                {4, 3},
                {2, 9}
        };

        nums[1][1] = 67;
        System.out.println(nums[1][1]);

    }
}
