package com.xie.d13_jdk8_time;

import java.time.Instant;

public class Test5_Instant {
    public static void main(String[] args) {
        // 1.創建Instant的對象，獲取此刻時間訊息
        Instant now = Instant.now();

        // 2. 獲取總秒數
        long second = now.getEpochSecond();
        System.out.println(second);

        // 3.不夠1秒的奈秒數
        int nano = now.getNano();
        System.out.println(nano);

        System.out.println(now);

        Instant instant = now.plusNanos(111);

        // Instant對象的作用: 做代碼的性能分析，或是紀錄用戶操作的時間點
        Instant now1 = Instant.now();
        // 代碼執行...
        Instant now2 = Instant.now();
    }
}
