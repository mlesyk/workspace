package strings.i18n;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Maks on 17.07.2017.
 */
public class DateFormatImpl {

    public static void main(String[] args) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
        Date date = null;
        String dateString = "July 17, 2017";
        try {
            date = df.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Parsing failed: " + e.getMessage());
        }
        System.out.println(df.format(date));
        df = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(df.format(date));
        df = DateFormat.getDateInstance(DateFormat.LONG, new Locale("uk","UA"));
        System.out.println(df.format(date));
        df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.SHORT, Locale.ENGLISH);
        System.out.println(df.format(date));
    }
}
