package java.date_and_time;

import java.io.*;
import java.util.Calendar;

//https://www.hackerrank.com/challenges/java-date-and-time/problem

enum DayName {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    public int dayOfWeek;

    DayName(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        int monthConverted = month - 1;
        calendar.set(year, monthConverted, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        DayName[] dayName = DayName.values();

        return dayName[dayOfWeek].name();
    }
}
