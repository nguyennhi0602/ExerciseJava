import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static Date convertDate(String input, SimpleDateFormat sdf) {
        Date date = null;
        sdf.setLenient(false);
        try {
            date = sdf.parse(input);
        } catch (ParseException e) {
            e.getMessage();
        }
        return date;
    }
}
