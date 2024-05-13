package les29.test7;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test7 {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.of(14, 40);
        LocalDate ld = LocalDate.of(2016, 12, 5);
        LocalDateTime ldt1 = LocalDateTime.of(2016, Month.JANUARY, 1, 16, 40);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyy");
        LocalDate date = LocalDate.parse("01 02 2015", formatter);
        System.out.println(date);
        LocalDate date2 = LocalDate.parse("2015-01-02");
        System.out.println(date2);



//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM - yyyy - hh:mm");
//        System.out.println(ldt1);
//        System.out.println(ldt1.format(formatter));




//        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
//        System.out.println(ld);
//        System.out.println(ld.format(d1));
//        DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME;
//        System.out.println(lt);
//        System.out.println(lt.format(d2));
//        DateTimeFormatter d3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
//        System.out.println(ldt1);
//        System.out.println(ldt1.format(d3));
//        DateTimeFormatter d4 = DateTimeFormatter.ISO_WEEK_DATE;
//        System.out.println(ld);
//        System.out.println(ld.format(d4));
//        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//        System.out.println(ld);
//        System.out.println(ld.format(shortFormat));
//        System.out.println(ldt1);
//        System.out.println(ldt1.format(shortFormat));
//        System.out.println(lt);
//        System.out.println(lt.format(shortFormat));
    }
}
