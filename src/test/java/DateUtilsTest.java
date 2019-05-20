import org.junit.Test;

import java.text.ParseException;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class DateUtilsTest {
    @Test
    public void test_convertToDate(){
        String input="35/02/2017";
        Date date = null;
        DateUtils.sdf.setLenient(false);
        try {
            date = DateUtils.sdf.parse(input);
        } catch (ParseException p) {
        }
        assertEquals(new DateUtils().convertToDate("35/02/2017",DateUtils.sdf),date);
    }

    @Test
    public void test_isYear(){
        assertEquals(new DateUtils().isYear(2017),true);
        assertEquals(new DateUtils().isYear(1888),false);
    }

    @Test
    public void test_isMonth(){
        assertEquals(new DateUtils().isMonth(7),true);
        assertEquals(new DateUtils().isYear(13),false);
    }

    @Test
    public void test_isDate(){
        assertEquals(new DateUtils().isDate("35/12/2018"),false);
    }

    @Test
    public void test_isDay(){
        assertEquals(new DateUtils().isDay(26,31),true);
        assertEquals(new DateUtils().isDay(98,30),false);
    }

    @Test
    public void test_isLeapYear(){
        assertEquals(new DateUtils().isLeapYear(2000),true);
        assertEquals(new DateUtils().isLeapYear(2015),false);
    }

    @Test
    public void test_getDayInMonth(){
        assertEquals(new DateUtils().getDayInMonth(2,2000),29);
        assertEquals(new DateUtils().getDayInMonth(3,2019),31);
        assertEquals(new DateUtils().getDayInMonth(2,2001),28);
    }

    @Test
    public void test_getDayInYear(){
        assertEquals(new DateUtils().getDayInYear(2017),365);
        assertEquals(new DateUtils().getDayInYear(2000),366);
    }

}
