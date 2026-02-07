package academy.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo e o primeiro day");
        }
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        Date date = c.getTime();
        System.out.println(date);
    }
}
