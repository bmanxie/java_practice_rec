package com.xie.d13_jdk8_time;

import java.time.LocalDate;

public class Test1_LocalDate {
    public static void main(String[] args) {
        // 0. 獲取本地日期對象
        LocalDate ld = LocalDate.now();  // 年 月 日
        System.out.println(ld);

        // 1. 獲取日期對象的訊息
        int year = ld.getYear(); // 年
        int month = ld.getMonthValue(); // 月(1-12)
        int day = ld.getDayOfMonth(); // 日
        int dayOfYear = ld.getDayOfYear(); //  一年中第幾天
        int dayOfWeek = ld.getDayOfWeek().getValue(); // 星期幾
        System.out.println(year);
        System.out.println(day);
        System.out.println(dayOfWeek);

        // 2. 直接修改某個訊息: withYear, withMonth, withDayMonth, withDayOfYear
        LocalDate ld2 = ld.withYear(2009);
        System.out.println(ld2);
        System.out.println(ld);

        // 3. 把某個訊息加多少: plusYear, plusMonth, plusDays, plusWeeks
        LocalDate ld3 = ld.plusYears(2);
        LocalDate ld4 = ld.plusMonths(2);

        // 4. 把某個訊息減多少: minusYear, minusMonth, minusDays, minusWeeks
        LocalDate ld5 = ld.minusYears(2);
        LocalDate ld6 = ld.minusMonths(2);


        // 5. 獲取指定日期的LocalDate對象: public static LocalDate of (int year, int month, int dayOfMonth)
        LocalDate ld7 = LocalDate.of(2025,12,25);
        LocalDate ld8 = LocalDate.of(2025,12,25);

        // 6. 判斷2個日期，是否相等，在前還是在後: equals isBefore isAfter
        System.out.println(ld7.equals(ld8));
        System.out.println(ld7.isAfter(ld));
        System.out.println(ld7.isBefore(ld));


    }
}
