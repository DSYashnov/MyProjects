package les29.test4;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Test4 {
    static void smenaDejurnogo(LocalDate nachalo, LocalDate conec, Period period){
        LocalDate data=nachalo;
        while(data.isBefore(conec)){
            System.out.println("Nastupila data " + data + " pora menyat dejurnogo");
            data=data.plus(period);
        }
    }
    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2016, Month.SEPTEMBER,1);
        LocalDate conec = LocalDate.of(2020, Month.MAY,31);
        Period period = Period.of(1, 3, 15);
        smenaDejurnogo(nachalo, conec, period);
    }
}
