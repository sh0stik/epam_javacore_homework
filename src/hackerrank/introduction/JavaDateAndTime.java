package hackerrank.introduction;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class JavaDateAndTime {
        public static String getDay (String day, String month, String year){
            DateFormatSymbols dfs = new DateFormatSymbols(Locale.US);
            String weekdays[] = dfs.getWeekdays();

            Calendar cal = new GregorianCalendar(Locale.US);
            cal.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));

            String dow = weekdays[cal.get(Calendar.DAY_OF_WEEK)].toUpperCase();
            return dow;
        }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        System.out.println(getDay(day, month, year));

    }
}
