package com.xie.d13_jdk8_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test6_DateTimeFormatter {
    public static void main(String[] args) {
        // 1. 創建一個日期時間格式化對象出來
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

        // 2. 對時間進行格式化
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        String rs = formatter.format(now); // 正向格式化
        System.out.println(rs);

        // 3. 格式化時間，還有一種方案
        String rs2 = now.format(formatter); // 反向格式化
        System.out.println(rs2);

        // 4. 解析時間，一般使用LocalDateTime提供的解析方法
        String dateStr = "2029年12月12日 12:12:12";
        LocalDateTime ldt = LocalDateTime.parse(dateStr, formatter);
        System.out.println(ldt);
    }
}
