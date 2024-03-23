package com.xie.d12_calendar;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
    public static void main(String[] args) {
        // 目標: 掌握Calendar的使用和特點
        // 1. 得到系統此刻時間對應的日曆對象
        Calendar now = Calendar.getInstance();
        System.out.println(now);

        // 2. 獲取日曆中的某個訊息
        int year = now.get(Calendar.YEAR);
        System.out.println(year);

        int days = now.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);

        // 3. 獲取日期對象
        Date d = now.getTime();
        System.out.println(d);

        // 4. 拿到時間毫秒值
        long time = now.getTimeInMillis();
        System.out.println(time);

        // 5. 修改日曆中的某個訊息
        now.set(Calendar.MONTH, 9);// 修改月份成10月份
        System.out.println(now);

        // 6. 為某個訊息增加或減少多少
        now.add(Calendar.DAY_OF_YEAR, 100); // 一年中的第幾天 + 100天
        System.out.println(now);


    }
}
