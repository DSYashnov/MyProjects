package chapter_10.enumExample;

import java.util.Arrays;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.SATURDAY);
        today.daysInfo();

        System.out.println(today.day);
        WeekDays w1 = WeekDays.SATURDAY;
        WeekDays w2 = WeekDays.SATURDAY;
        WeekDays w3 = WeekDays.MONDAY;
        System.out.println(w1==w2);
        System.out.println(WeekDays.SATURDAY.equals(WeekDays2.SATURDAY)) ;
        WeekDays w15 = WeekDays.valueOf("MONDAY");
        System.out.println(w15);

        WeekDays[] arr= WeekDays.values();
        System.out.println(Arrays.toString(arr));
    }
}
enum WeekDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("great");

    String mood;

    private WeekDays(String mood) {
        this.mood = mood;
    }
//    private WeekDays() {
//    }

    public String getMood() {
        return mood;
    }
}


class Today {
    WeekDays day;
    public Today(WeekDays day){
        this.day = day;
    }
    void daysInfo(){
        switch(day){
            case MONDAY:
                case TUESDAY:
                    case WEDNESDAY:
                        case THURSDAY:
                            case FRIDAY:
                                System.out.println("go to work");
                                break;
                                case SATURDAY:
                                    case SUNDAY:
                                        System.out.println("stay home");
                                        break;
        }
        System.out.println("Today's day is " + day.getMood());
    }
}
enum WeekDays2 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}