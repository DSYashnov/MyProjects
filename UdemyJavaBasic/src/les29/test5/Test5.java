package les29.test5;

import java.time.*;

public class Test5 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2016, Month.JANUARY, 1, 16, 40);
        LocalTime lt = LocalTime.of(10,30);
//        Period of = Period.ofMonths(3). ofDays(10);
        Period period = Period.ofMonths(3);
        //period = Period.ofDays(10);
        Duration duration = Duration.ofMinutes(3);
        System.out.println(ldt.plus(duration).plus(period));
    }
//    }
}
