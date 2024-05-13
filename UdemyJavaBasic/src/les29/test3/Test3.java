package les29.test3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test3 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2014, 5, 31);
        LocalDate ld1 = LocalDate.of(2012, Month.JUNE, 10);
//        System.out.println(ld.isBefore(ld1));

        LocalTime lt = LocalTime.of(15,30);
        LocalTime lt1 = LocalTime.of(03,5,10,55598);
        System.out.println(lt.isAfter(lt1));

        LocalDateTime ldt = LocalDateTime.of(2015,Month.JANUARY,10,17,25);
        LocalDateTime ldt1 = LocalDateTime.of(2015,Month.JANUARY,10,17,25, 9);
        System.out.println(ldt.isBefore(ldt1));



    }
}
