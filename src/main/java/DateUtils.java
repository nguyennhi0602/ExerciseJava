import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");


    public static Date convertToDate(String input, SimpleDateFormat sdf) {
        Date date = null;
        sdf.setLenient(false);
        try {
            date = sdf.parse(input);
        } catch (ParseException p) {
        }
        return date;
    }
    public static boolean isYear(int year) {
        return year >= 1900 && year <= 3000;
    }

    public static boolean isMonth(int month) {
        return month >= 1 && month <= 12;
    }

    public static boolean isDay(int day, int numberOfDayInMonth) {
        return day >= 1 && day <= numberOfDayInMonth;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0)||year % 400 == 0 ;
    }

    public static int getDayInMonth(int month, int year) {
        int[] daysOfMonths = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int day = daysOfMonths[month-1];
        if(month==2 && isLeapYear(year)){
            return day+1;
        }
        return day;
    }

    public static int getDayInYear(int year) {
        if(isLeapYear(year)){
            return 366;
        }
        return 365;
    }
}
