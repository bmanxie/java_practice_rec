package com.xie.d13_jdk8_time;

import java.time.Duration;
import java.time.LocalDateTime;

public class Test8_Duration {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2018,7,7,10,12,13);
        LocalDateTime end = LocalDateTime.of(2024,3,23,22,12,13);

        // 1. 得到Duration對象
        Duration duration = Duration.between(start,end);

        // 2. 獲取兩個時間對象的間隔訊息
        System.out.println(duration.toDays()); // 間隔多少天
        System.out.println(duration.toHours()); // 間隔多少時
        System.out.println(duration.toMinutes()); // 間隔多少分
        System.out.println(duration.toSeconds()); // 間隔多少秒
        System.out.println(duration.toMillis()); // 間隔多少毫秒
        System.out.println(duration.toNanos()); // 間隔多少奈秒

    }
}
