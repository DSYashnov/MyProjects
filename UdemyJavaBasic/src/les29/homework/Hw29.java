package les29.homework;

import java.time.*;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Hw29 {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    void smena(LocalDateTime ldt, LocalDateTime ldt1, Period p, Duration d) {
        LocalDateTime start = ldt;
        while (start.isBefore(ldt1)) {
            System.out.println("We work in: " + start.format(dtf));
            start = start.plus(p);
            System.out.println("To: " + start.format(dtf1));
            System.out.println("We don`t work in: " + start.format(dtf1));
            start = start.plus(d);
            System.out.println("To: " + start.format(dtf1));
        }
    }

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2016,01,01,9,0,0);
        LocalDateTime ldt1 = LocalDateTime.of(2016,10,31,18,0,0);
        Period p = Period.of(0,1,2);
        Duration d = Duration.ofMinutes(600);
        Hw29 hw = new Hw29();
        hw.smena(ldt, ldt1, p, d);
    }
}
