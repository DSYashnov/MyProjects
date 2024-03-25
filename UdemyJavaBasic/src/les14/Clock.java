package les14;

public class Clock {
    public void time(){
        for (int hours = 0; hours <= 23; hours++){
            for (int minutes = 0; minutes <= 59; minutes++){
                System.out.println(hours + ":" + minutes);
            }
        }
    }

    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.time();
    }
}
