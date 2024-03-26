package les14;

public class Clock {
    public void time() {
        OUTER:
        for (int hours = 0; hours <= 23; hours++) {
            System.out.println("Nachalo outer loopa");
            INNER: for (int minutes = 0; minutes <= 59; minutes++) {
                System.out.println(hours + ":" + minutes);

                if (minutes == 30) {
                    break INNER;
                }
            }
            System.out.println("Konets outer loopa");
        }
    }

    public static void main(String[] args){
            Clock clock = new Clock();
            clock.time();

    }
}
