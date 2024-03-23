package com.xie.d13_jdk8_time;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test4_ZoneId_ZonedDateTime {
    public static void main(String[] args) {
        // 目標: 了解時區和帶時區的時間
        // 1. ZoneId的常見方法:
        // public static ZoneId systemDefault(): 獲取系統默認時間
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId.getId());
        System.out.println(zoneId);

        // public static Set<String> getAvailableZoneIds(): 獲取Java支持的全部時區Id
        System.out.println(ZoneId.getAvailableZoneIds());

        // public static ZoneId of(String zoneId): 把某個時區id封裝成ZoneId對象
        ZoneId zoneId1 = ZoneId.of("America/New_York");

        // 2. ZoneDateTime: 帶時區的時間
        // public static ZoneDateTime now(ZoneId zone): 獲取某個時區的ZoneDateTime對象
        ZonedDateTime now = ZonedDateTime.now(zoneId1);
        System.out.println(now);

        ZonedDateTime now1 = ZonedDateTime.now(Clock.systemUTC());
        System.out.println(now1);
        // public static ZoneDateTime now(): 獲取系統默認時區的ZoneDateTime對象
        ZonedDateTime now2 = ZonedDateTime.now();
        System.out.println(now2);
    }
}
