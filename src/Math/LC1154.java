package Math;

public class LC1154 {
    static int dayOfYear(String date) {
        int[]  daysinMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        if((year%400 == 0) || (year%4 == 0 && year%100 != 0)){
            daysinMonth[1] = 29;
        }

        int res = day;
        for(int i=0; i<month-1; i++){
            res += daysinMonth[i];
        }

        return res;
    }
}

//Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD,
// return the day number of the year.
//Example 1:
//
//Input: date = "2019-01-09"
//Output: 9
//Explanation: Given date is the 9th day of the year in 2019.