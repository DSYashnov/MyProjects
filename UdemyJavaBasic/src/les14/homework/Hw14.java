package les14.homework;

public class Hw14 {
    public static void clock(){
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
    public static void main(String[] args) {
        clock();
    }
}
