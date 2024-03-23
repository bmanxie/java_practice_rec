package com.xie.d11_simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        // 目標: 完成秒殺實例
        // 1. 把開始時間、結束時間、甲下單時間、乙下單時間到程序中
        String start = "2023年11月11日 00:00:00";
        String end = "2023年11月11日 00:10:00";
        String c1 = "2023年11月11日 00:01:18";
        String c2 = "2023年11月11日 00:10:57";

        // 2. 把字符串的時間解析成日期對象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDt = sdf.parse(start);
        Date endDt = sdf.parse(end);
        Date c1Dt = sdf.parse(c1);
        Date c2Dt = sdf.parse(c2);

        // 3. 判斷是否秒殺成功
        // 把日期對象轉換成時間毫秒值
        long startTime = startDt.getTime();
        long endTime = endDt.getTime();
        long c1Time = c1Dt.getTime();
        long c2Time = c2Dt.getTime();

        System.out.println((c1Time >= startTime && c1Time <= endTime ? "秒殺成功" : "秒殺失敗"));
        System.out.println((c2Time >= startTime && c2Time <= endTime ? "秒殺成功" : "秒殺失敗"));
    }
}
