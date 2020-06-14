package com.study.daydayup;

import org.assertj.core.util.DateUtil;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * JDK8新推出的日期时间类
 *  1.Instant --> Date
 *  2.LocalDte
 *  3.LocalTime
 *  4.LocalDateTime --> Calendar
 *  5.DateTimeFormatter --> SimpleDateFormat
 */
public class Test02 {
    public static void main(String[] args) {
    //1.Instant
        //1.1获取当前时间
        Instant instant = Instant.now();
        //utc时间
        System.out.println("instant = " + instant);
        //当地时
        System.out.println("instant = " + instant.atZone(ZoneId.systemDefault()));
        //1.获取时间戳
        //当前时间戳:单位秒
        System.out.println(instant.getEpochSecond());
        //当前时间戳:时间毫秒
        System.out.println(instant.toEpochMilli());
        //1.3将long转换为Instant
        //1)根据秒数时间戳转换：
        System.out.println("instant = " + instant);
        long epochSecond = instant.getEpochSecond();
        System.out.println(Instant.ofEpochSecond(epochSecond,instant.getNano()));
        System.out.println(Instant.ofEpochSecond(epochSecond));
        //2)根据毫秒数时间戳转换：
        long epochMilli = instant.toEpochMilli();
        System.out.println(Instant.ofEpochMilli(epochMilli));
        //1.4 将String转换为Instant
        //text 的格式必须正确
        String text = "2020-06-10T08:46:55.967Z";
        Instant parseInstant = Instant.parse(text);
        System.out.println("秒时间戳:" + parseInstant.getEpochSecond());
        System.out.println("豪秒时间戳:" + parseInstant.toEpochMilli());
        System.out.println("纳秒:" + parseInstant.getNano());
    //2.LocalDate
        // TODO: 2020/6/14 功能:
        //   1.获取yyyy-MM-dd使用LocalDate方便
        //   2.使用equals做时间比较
        //2.1 获取当前日期
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);
        //2.2 获取年月日
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();

        System.out.println("year: " + year);
        System.out.println("month: " + month);
        System.out.println("day: " + day);
        //2.3指定日期
        LocalDate localDate = LocalDate.of(2020, 6, 1);
        System.out.println("localDate = " + localDate.toString());
        //2.4 比较日期是否相等
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2020, 6, 14);
        if (localDate1.equals(localDate2)) {
            System.out.println("localDate1 equals localDate2");
        }
        //2.5获取日期是本周/本月/本年的第几天
        System.out.println("Today:" + today);
        System.out.println("Today is:" + today.getDayOfWeek());
        System.out.println("今天是本周的第" + today.getDayOfWeek().getValue() + "天");
        System.out.println("今天是本月的第" + today.getDayOfMonth() + "天");
        System.out.println("今天是本年的第" + today.getDayOfYear() + "天");
        //2.6 判断是否为闰年
        System.out.println(today.getYear() + " is leap year:" + today.isLeapYear());
    //3. LocalTime
        //3.1 获取时分秒
        Date date = new Date();

        int hour = date.getHours();
//        int minute = date.getMinutes();
//        int second = date.getSeconds();
//
//        System.out.println("hour: " + hour);
//        System.out.println("minute: " + minute);
//        System.out.println("second: " + second);
        Calendar calendar = Calendar.getInstance();
        int i = 1 / 0;
// 12小时制
        int hourOf12 = calendar.get(Calendar.HOUR);
// 24小时制
        int hourOf24 = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int milliSecond = calendar.get(Calendar.MILLISECOND);

        System.out.println("hourOf12: " + hourOf12);
        System.out.println("hourOf24: " + hourOf24);
        System.out.println("minute: " + minute);
        System.out.println("second: " + second);
        System.out.println("milliSecond: " + milliSecond);

    }
}

