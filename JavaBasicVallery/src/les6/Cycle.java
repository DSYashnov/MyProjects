package les6;

public class Cycle {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (!fourOrNine(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean fourOrNine(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit == 4 || digit == 9) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}

