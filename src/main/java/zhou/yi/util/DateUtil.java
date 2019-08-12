package zhou.yi.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/7 16:48
 */
public class DateUtil {
    private static final ThreadLocal<SimpleDateFormat> monthFormatThreadLocal = new ThreadLocal<SimpleDateFormat>() {
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM");
        }
    };
    private static final ThreadLocal<SimpleDateFormat> dateFormatThreadLocal = new ThreadLocal<SimpleDateFormat>() {
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    };
    private static final ThreadLocal<SimpleDateFormat> timeFormatThreadLocal = new ThreadLocal<SimpleDateFormat>() {
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };
    private static final ThreadLocal<Calendar> calendarThreadLocal = new ThreadLocal<Calendar>() {
        protected Calendar initialValue() {
            return Calendar.getInstance();
        }
    };

    public DateUtil() {
    }

    public static String toStringMonth(Date month) {
        return ((SimpleDateFormat) monthFormatThreadLocal.get()).format(month);
    }

    public static String toStringDate(Date time) {
        return ((SimpleDateFormat) dateFormatThreadLocal.get()).format(time);
    }

    public static String toStringTime(Date time) {
        return ((SimpleDateFormat) timeFormatThreadLocal.get()).format(time);
    }

    public static Date toMonth(Date time) {
        Calendar calendar = (Calendar) calendarThreadLocal.get();
        calendar.setTime(time);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    public static Date toMonth(String time) throws ParseException {
        return ((SimpleDateFormat) monthFormatThreadLocal.get()).parse(time);
    }

    public static Date toDate(Date time) {
        Calendar calendar = (Calendar) calendarThreadLocal.get();
        calendar.setTime(time);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    public static Date toDate(String date) throws ParseException {
        return ((SimpleDateFormat) dateFormatThreadLocal.get()).parse(date);
    }

    public static Date toTime(Date time) {
        Calendar calendar = (Calendar) calendarThreadLocal.get();
        calendar.setTime(time);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    public static Date toTime(String time) throws ParseException {
        return ((SimpleDateFormat) timeFormatThreadLocal.get()).parse(time);
    }

    public static Date getNowMonth() {
        return toMonth(new Date());
    }

    public static Date getNowDate() {
        return toDate(new Date());
    }

    public static Date getNowTime() {
        return toTime(new Date());
    }

    public static Date timeAfterDays(Date time, int days) {
        Calendar calendar = (Calendar) calendarThreadLocal.get();
        calendar.setTime(time);
        calendar.add(5, days);
        return calendar.getTime();
    }

    public static Date timeBeforeDays(Date time, int days) {
        return timeAfterDays(time, -1 * days);
    }

    public static Date timeAfterSeconds(Date time, int seconds) {
        Calendar calendar = (Calendar) calendarThreadLocal.get();
        calendar.setTime(time);
        calendar.add(13, seconds);
        return calendar.getTime();
    }

    public static Date timeBeforeSeconds(Date time, int seconds) {
        return timeAfterSeconds(time, -1 * seconds);
    }

    public static void sleep(int sec) throws InterruptedException {
        Thread.sleep((long) (sec * 1000));
    }
}
