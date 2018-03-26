package chat;


import java.time.DayOfWeek;
import java.time.LocalDate;

public class MyCalendar {
    public static DayOfWeek go() {
    LocalDate ls = LocalDate.parse("2010-05-05");
    DayOfWeek day = ls.getDayOfWeek();
    return day;
    }
    public static void main(String[] args) {
        System.out.println(go());


    }
}
