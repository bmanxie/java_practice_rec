package com.xie.d10_date;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        // 目標: 掌握Date日期類的使用
        // 1. 創建一個Date的對象，代表系統當前時間訊息
        Date d = new Date();
        System.out.println(d);

        // 2. 拿到時間毫秒值
        long time = d.getTime();
        System.out.println(time);

        // 3. 把時間毫秒值轉換成日期對象， 2s之後的時間是多少
        time += 2 * 1000;
        Date d2 = new Date(time);
        System.out.println(d2);

        // 4. 直接把日期對象的時間通過setTime方法修改
        Date d3 = new Date();
        d3.setTime(time);
        System.out.println(d3);
    }
}
