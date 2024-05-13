package les29.test6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.*;

public class Test6 {
    public static void main(String[] args) {
        LocalDate ldt = LocalDate.of(2016, Month.APRIL, 1);
        LocalDateTime ldt1 = LocalDateTime.of(2016, Month.JANUARY, 1, 16, 40);
        LocalTime lt = LocalTime.of(16, 40);

        System.out.println(lt.getMinute());
    }
}
