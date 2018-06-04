
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTime {

    public static SimpleDateFormat getDate() {
        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd_HH:mm:ss");
        date.format(Calendar.getInstance().getTime());
        return date;
    }
}
