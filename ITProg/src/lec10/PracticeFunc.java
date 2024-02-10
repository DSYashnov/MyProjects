package lec10;

public class PracticeFunc {
    public static void main(String[] args) {
        byte[] nums1 = new byte[] {5, 6, 8};

        int sum1 = sumArray(nums1);
        System.out.println("Sum 1: " + sum1);

        byte[] nums2 = new byte[] {5, 6, 8, 3, 4};

        int sum2 = sumArray(nums2);
        System.out.println("Sum 2: " + sum2);

    }
    public static int sumArray(byte[] arr) {
        int summa = 0;
        for (byte i = 0; i < arr.length; i++){
            summa += arr[i];
        }
        return summa;
    }
}
