package com.xie.d11_simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        // 目標: 把日期對象、時間毫秒值格式化我們想要的形式
        // 1.準備時間
        Date d = new Date();
        System.out.println(d);

        long time = d.getTime();
        System.out.println(time);

        // 2. 格式化日期對象、時間毫秒值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        String rs = sdf.format(d);
        String rs2 = sdf.format(time);
        System.out.println(rs);
        System.out.println(rs2);

        System.out.println("==============");

        // 將字符串時間轉成日期對象
        String datestr = "2024-01-01 12:12:12";
        // 1. 創建簡單日期格式化對象，指定的時間格式化必須與被解析的格式一樣，否則會出bug
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d2 = sdf2.parse(datestr);
        System.out.println(d2);
    }
}
