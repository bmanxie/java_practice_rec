package com.xie.d13_jdk8_time;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test2_LocalTime {
    public static void main(String[] args) {
        // 0. 獲取本地日期對象
        LocalTime lt = LocalTime.now();  // 年 月 日
        System.out.println(lt);

        // 1. 獲取日期對象的訊息
        int hour = lt.getHour(); // 時
        int minute = lt.getMinute(); // 分
        int second = lt.getSecond(); // 秒
        int nano = lt.getNano(); // 奈秒
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
        System.out.println(nano);

        // 2. 直接修改某個訊息: withHour, withMinute, withSecond, withNano
        LocalTime lt2 = lt.withHour(10);
        LocalTime lt3 = lt.withMinute(10);
        LocalTime lt4 = lt.withSecond(10);
        LocalTime lt5 = lt.withNano(10);

        // 3. 把某個訊息加多少: plusHours, plusMinutes, plusSeconds, plusNanos
        LocalTime lt6 = lt.plusHours(10);
        LocalTime lt7 = lt.plusMinutes(10);
        LocalTime lt8 = lt.plusSeconds(10);
        LocalTime lt9 = lt.plusNanos(10);

        // 4. 把某個訊息減多少: minusHours, minusMinutes, minusSeconds, minusNanos
        LocalTime lt10 = lt.minusHours(10);
        LocalTime lt11 = lt.minusMinutes(10);
        LocalTime lt12 = lt.minusSeconds(10);
        LocalTime lt13 = lt.minusNanos(10);


        // 5. 獲取指定日期的LocalTime對象:
        // public static LocalTate of (int hour, int minute, int second)
        LocalTime lt14 = LocalTime.of(21,20,10);
        LocalTime lt15 = LocalTime.of(21,20,10);

        // 6. 判斷2個日期，是否相等，在前還是在後: equals isBefore isAfter
        System.out.println(lt14.equals(lt15));
        System.out.println(lt14.isAfter(lt));
        System.out.println(lt14.isBefore(lt));

    }
}
