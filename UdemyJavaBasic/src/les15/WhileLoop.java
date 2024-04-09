package les15;

public class WhileLoop {

       /* public static void clock(){
            OUTER:
            for (int hours = 0; hours < 6; hours++){
                MIDDLE:
                for (int minutes = 0; minutes <= 60; minutes++){
                    if (hours > 1 && minutes % 10 == 0){
                        break OUTER;
                    }
                    INNER:
                    for (int second = 0; second < 60; second++){
                        if (second * hours > minutes){
                            continue MIDDLE;
                        }
                        System.out.println(hours + ":" + minutes + ":" + second);
                    }
                }
            }
        }
        */

    public static void main(String[] args) {
        //clock();
        int hours = 0;

        OUTER:
        while (hours < 6) {
            int minutes = -1;
            hours++;
            MIDDLE:
            do {
                minutes++;
                if (hours > 1 && minutes % 10 == 0) {
                    break OUTER;
                }
                int second = 0;
                INNER:
                while (second < 60) {
                    if (second * hours > minutes) {
                        continue MIDDLE;
                    }
                    System.out.println(hours + ":" + minutes + ":" + second);
                    second++;
                }
            } while (minutes < 59);
            hours++;
        }
    }
}


