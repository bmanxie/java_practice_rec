package com.xie.d13_jdk8_time;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        // 傳統的時間類(Date, SimpleDateFormat, Calendar)存在下面問題
        // 1. 設計不合理
        // Date d = new Date();
        // System.out.println(d.getYear() + 1900);

        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        // 2. 都是可變對象，修改後會失去最開始的時間訊息

        // 3. 執行緒不安全

        // 4. 不能精確到奈秒，只能精確到毫秒
        // 1s = 1000ms
        // 1ms = 1000微秒
        // 1微秒 = 1000nms
    }
}
