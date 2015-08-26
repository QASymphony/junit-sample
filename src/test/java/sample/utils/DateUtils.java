package sample.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by duongnapham on 8/26/15.
 */
public class DateUtils {

    public String getCurrentDate(){
        Date dNow = new Date( );
        SimpleDateFormat ft =
                new SimpleDateFormat ("yyyy/MM/dd HH:mm:ss");
        return ft.format(dNow);
    }
}
