package les13.homework;

public class Hw13 {
}
    class Month {
        public static void dayQuantity(int n) {
            switch (n) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31 day");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 day");
                    break;
                case 2:
                    System.out.println("28 day");
                    break;
                default:
                    System.out.println("incorrect month");
            }
        }


        public static void main(String[] args) {
            dayQuantity(5);
        }
    }



