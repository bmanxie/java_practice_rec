package com.xie.d13_jdk8_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test3_LocalDateTime {
    public static void main(String[] args) {
        // 0. 獲取本地日期對象
        LocalDateTime ldt = LocalDateTime.now();  // 年 月 日
        System.out.println(ldt);

        // 1. 獲取日期對象的訊息
        int year = ldt.getYear(); // 年
        int month = ldt.getMonthValue(); // 月(1-12)
        int day = ldt.getDayOfMonth(); // 日
        int dayOfYear = ldt.getDayOfYear(); //  一年中第幾天
        int dayOfWeek = ldt.getDayOfWeek().getValue(); // 星期幾
        int hour = ldt.getHour(); // 時
        int minute = ldt.getMinute(); // 分
        int second = ldt.getSecond(); // 秒
        int nano = ldt.getNano(); // 奈秒


        // 2. 直接修改某個訊息:
        // withYear, withMonth, withDayMonth, withDayOfYear, withHour, withMinute, withSecond, withNano
        LocalDateTime ldt2 = ldt.withYear(2029);
        LocalDateTime ldt3 = ldt.withMinute(25);

        // 3. 把某個訊息加多少:
        // plusYear, plusMonth, plusDays, plusWeeks, plusHours, plusMinutes, plusSeconds, plusNanos
        LocalDateTime ldt4 = ldt.plusYears(2);
        LocalDateTime ldt5 = ldt.plusHours(2);

        // 4. 把某個訊息減多少:
        // minusYear, minusMonth, minusDays, minusWeeks, minusHours, minusMinutes, minusSeconds, minusNanos
        LocalDateTime ldt6 = ldt.plusWeeks(2);
        LocalDateTime ldt7 = ldt.plusSeconds(2);


        // 5. 獲取指定日期的LocalDateTime對象:
        // public static LocalDateTime of (int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond)
        LocalDateTime ldt8 = LocalDateTime.of(2029,12,12,12,12,12);
        LocalDateTime ldt9 = LocalDateTime.of(2029,12,12,12,12,12);

        // 6. 判斷2個日期，是否相等，在前還是在後: equals isBefore isAfter
        System.out.println(ldt9.equals(ldt8));
        System.out.println(ldt9.isAfter(ldt));
        System.out.println(ldt9.isBefore(ldt));

        // 7. 可以把LocalDateTime轉換成LocalDate和LocalTime
        // public LocalDate toLocalDate()
        // public LocalTime toLocalTime()
        // public static LocalDateTime of(LocalDate date, LocalTime, time)
        LocalDate ld = ldt.toLocalDate();
        LocalTime lt = ldt.toLocalTime();

        LocalDateTime ldt10 = LocalDateTime.of(ld, lt);

    }
}
