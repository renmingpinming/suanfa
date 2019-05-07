package zhou.yi.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateUtilSelf extends DateUtil {
    private static final ThreadLocal<SimpleDateFormat> batchMonthFormatThreadLocal =
            new ThreadLocal<SimpleDateFormat>() {
                @Override protected SimpleDateFormat initialValue() {
                    return new SimpleDateFormat("yyyyMM");
                }
            };

    private static final ThreadLocal<SimpleDateFormat> batchDayFormatThreadLocal =
            new ThreadLocal<SimpleDateFormat>() {
                @Override protected SimpleDateFormat initialValue() {
                    return new SimpleDateFormat("yyyyMMdd");
                }
            };

    private static final ThreadLocal<SimpleDateFormat> batchMinuteFormatThreadLocal =
            new ThreadLocal<SimpleDateFormat>() {
                @Override protected SimpleDateFormat initialValue() {
                    return new SimpleDateFormat("yyyyMMddHHmm");
                }
            };

    private static final ThreadLocal<SimpleDateFormat> batchSecondThreadLocal =
            new ThreadLocal<SimpleDateFormat>() {
                @Override protected SimpleDateFormat initialValue() {
                    return new SimpleDateFormat("yyyyMMddHHmmss");
                }
            };
    private static final ThreadLocal<SimpleDateFormat> batchSecondThreadLocalStyleTwo =
            new ThreadLocal<SimpleDateFormat>() {
                @Override protected SimpleDateFormat initialValue() {
                    return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                }
            };
    private static final ThreadLocal<SimpleDateFormat> batchSecondThreadLocalStyleThree =
            new ThreadLocal<SimpleDateFormat>() {
                @Override protected SimpleDateFormat initialValue() {
                    return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                }
            };

    // DATE TO BATCH STRING

    public static String toBatchMonthStringDate(Date time) {
        return batchMonthFormatThreadLocal.get().format(time);
    }

    public static String toBatchDayStringDate(Date time) {
        return batchDayFormatThreadLocal.get().format(time);
    }

    public static String toBatchMinuteStringDate(Date time) {
        return batchMinuteFormatThreadLocal.get().format(time);
    }

    public static String toBatchSecondStringDateStyleTwo(Date time) {
        return batchSecondThreadLocalStyleTwo.get().format(time);
    }
    public static String toBatchSecondStringDateStyleThree(Date time) {
        return batchSecondThreadLocalStyleThree.get().format(time);
    }

    public static Long toBatchSecondStringDate(Date time) {
        return Long.parseLong(batchSecondThreadLocal.get().format(time));
    }
    // DATE TO BATCH

    public static Integer getBatchMonth(Date date) {
        return Integer.parseInt(DateUtilSelf.toBatchMonthStringDate(date));
    }

    public static Integer getBatchDay(Date date) {
        return Integer.parseInt(DateUtilSelf.toBatchDayStringDate(date));
    }

    public static Long getBatchMinute(Date date) {
        return Long.parseLong(DateUtilSelf.toBatchMinuteStringDate(date));
    }

    public static Integer getHourMinute(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.HOUR_OF_DAY) * 100 + cal.get(Calendar.MINUTE);
    }

    // BATCH TO DATE

    public static Date toDateByBatchMonth(Integer batchMonth) throws ParseException {
        return batchMonthFormatThreadLocal.get().parse(batchMonth.toString());
    }

    public static Date toDateByBatchDay(Integer batchDay) throws ParseException {
        return batchDayFormatThreadLocal.get().parse(batchDay.toString());
    }

    public static Date toDateByBatchMinute(Long batchMinute) throws ParseException {
        return batchMinuteFormatThreadLocal.get().parse(batchMinute.toString());
    }

    public static Date toDateByBatchSecond(String  batchSecond) throws ParseException {
        return batchSecondThreadLocalStyleThree.get().parse(batchSecond);
    }

    public static Date getFirstDayInMonth(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.DAY_OF_MONTH, 1);
        return c.getTime();
    }

    public static Date getLastDayInMonth(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
        return c.getTime();
    }

    public static Integer getFirstDayInMonthBatchDay(Date date) {
        return getBatchDay(getFirstDayInMonth(date));
    }

    public static Integer getLastDayInMonthBatchDay(Date date) {
        return getBatchDay(getLastDayInMonth(date));
    }

    public static Integer getFirstBatchDay(Integer batchMonth) throws ParseException {
        Date date = toDateByBatchMonth(batchMonth);
        return getFirstDayInMonthBatchDay(date);
    }

    public static Integer getLastBatchDay(Integer batchMonth) throws ParseException {
        Date date = toDateByBatchMonth(batchMonth);
        return getLastDayInMonthBatchDay(date);
    }

    private static final Long oneDayInMills = 1000 * 60 * 60 * 24l;

    /**
     *
     * <p>Title: 自然月区间日期</p>
     * <p>Description: 获取区间所有日期，前后包含</p>
     * @param startBatchDay
     * @param endBatchDay
     * @return
     */
    public static List<Integer> batchDayBetween(Integer startBatchDay, Integer endBatchDay) {
        Long startTIme = getBatchDayInMillis(startBatchDay);

        Long endTime = getBatchDayInMillis(endBatchDay);

        Long time = startTIme;

        List<Integer> list = new ArrayList<Integer>();
        while (time <= endTime) {
            list.add(getBatchDay(new Date(time)));
            time += oneDayInMills;
        }

        return list;
    }

    public static int batchDayBetweenSum(Integer startBatchDay, Integer endBatchDay) {
        return batchDayBetween(startBatchDay, endBatchDay).size();
    }

    public static Long getBatchDayInMillis(Integer batchDay) {
        Calendar cal = Calendar.getInstance();
        cal.set(batchDay / 10000, (batchDay % 10000) / 100 - 1, batchDay % 100, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTimeInMillis();
    }

    /**
     * 获取前一天
     * @param batchDay
     * @return
     */
    public static Date getDatePre(Integer batchDay) throws ParseException {
        return getDatePre(toDateByBatchDay(batchDay));
    }

    /**
     * 获取后一天
     * @param batchDay
     * @return
     */
    public static Date getDateAfter(Integer batchDay) throws ParseException {
        return getDateAfter(toDateByBatchDay(batchDay));
    }

    public static Date getDatePre(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, -1);
        return cal.getTime();
    }

    public static Date getDateAfter(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, 1);
        return cal.getTime();
    }

    public static Integer getBatchDayPre(Date date) {
        return getBatchDay(getDatePre(date));
    }

    public static Integer getBatchDayAfter(Date date) {
        return getBatchDay(getDateAfter(date));
    }

    public static Integer getBatchDayPre(Integer batchDay) throws ParseException {
        return getBatchDay(getDatePre(batchDay));
    }

    public static Integer getBatchDayAfter(Integer batchDay) throws ParseException {
        return getBatchDay(getDateAfter(batchDay));
    }

    /**
     * DATE = BatchDay+BatchMinute
     */
    public static Date getByBatchDayAndBatchMinute(
            Integer batchDay, Integer hourMinute) throws ParseException {
        return getByBatchDayAndBatchMinute(batchDay, hourMinute, false);
    }

    public static Date getByBatchDayAndBatchMinute(
            Integer batchDay, Integer batchMinute, boolean nextDay) throws ParseException {

        Date date;
        if (nextDay) {
            date = getDateAfter(batchDay);
        } else {
            date = toDateByBatchDay(batchDay);
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        if (batchMinute != null) {
            int hour   = batchMinute / 100;
            int minute = batchMinute % 100;

            cal.set(Calendar.HOUR, hour);
            cal.set(Calendar.MINUTE, minute);
        }
        return cal.getTime();
    }

    /**
     * 时间加
     * @param date
     * @param minutes
     * @return
     */
    public static Date addMinutes(Date date, int minutes) {
        return addSecond(date, minutes * 60);
    }

    public static Date addSecond(Date date, int second) {
        return addMills(date, second * 1000);
    }

    public static Date addMills(Date date, int mills) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MILLISECOND, mills);
        return cal.getTime();
    }

    /**
     * 时间相差毫秒数
     * @param pre
     * @param after
     * @return
     */
    public static Long differ(Date pre, Date after) {
        return after.getTime() - pre.getTime();
    }

    public static boolean isBetween(Integer source, Integer start, Integer end) {
        return source >= start && source <= end;
    }

    public static Integer getMonth(Integer batchDay) {
        return batchDay % 10000 / 100;
    }

    public static Integer getDate(Integer batchDay) {
        return batchDay % 100;
    }

    public static Long getHour(Long duration) {
        return duration / (60 * 60 * 1000);
    }

    public static Long getMinutes(Long duration) {
        return (duration % (60 * 60 * 1000)) / 1000 / 60;
    }

    /**
     * 两个时间相差距离多少天多少小时多少分多少秒
     * @return String 返回值为：xx天xx小时xx分xx秒
     */
    public static String getDistanceStr(Date one, Date two) {
        long day;
        long hour;
        long min;
        long sec;
        long time1 = one.getTime();
        long time2 = two.getTime();
        long diff;
        if (time1 < time2) {
            diff = time2 - time1;
        } else {
            diff = time1 - time2;
        }
        day = diff / (24 * 60 * 60 * 1000);
        hour = (diff / (60 * 60 * 1000) - day * 24);
        min = ((diff / (60 * 1000)) - day * 24 * 60 - hour * 60);
        sec = (diff / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
        return day + "天" + hour + "小时" + min + "分" + sec + "秒";
    }

    public static Date getStartTimeOfDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static Date getEndTimeOfDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 59);
        return calendar.getTime();
    }

    public static void main(String[] args) {
        System.out.println(getStartTimeOfDay(new Date()));
    }
}
