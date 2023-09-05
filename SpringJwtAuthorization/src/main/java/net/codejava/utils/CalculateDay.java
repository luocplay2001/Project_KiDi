package net.codejava.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CalculateDay {
    public static long calculateDay(Date date1, Date date2) {
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //PLus 24h
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.HOUR, 24);
        Date date3 = null;
        Date date4 = null;
        try {
            // calculating the difference b/w startDate and endDate
            String startDate =  simpleDateFormat.format(date1);
            String endDate = simpleDateFormat.format(date2);

            date3 = simpleDateFormat.parse(startDate);
            date4 = simpleDateFormat.parse(endDate);

            long getDiff = date4.getTime() - date3.getTime();

            System.out.println(getDiff);

            long getDaysDiff = TimeUnit.MILLISECONDS.toDays(getDiff);

            return getDaysDiff;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
