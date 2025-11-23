package hackerRank;
import java.util.*;

public class HK_Day_Of_Week {
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();

        cal.set(year, month-1, day); //month is 0-indexed

        String[] days = {
                "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY",
                "THURSDAY", "FRIDAY", "SATURDAY"
        };

        return days[cal.get(Calendar.DAY_OF_WEEK)-1]; //days is also 0-indexed
    }
}
