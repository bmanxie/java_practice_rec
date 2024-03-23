package com.xie.d7_system;

public class SystemTest {
    public static void main(String[] args) {
        // 目標: 了解System類的常用方法
        // 1. public static void exit(int status):
        //     終止目前運行的Java虛擬機
        //     該參數用作狀態代碼; 按照慣例，非零狀態代碼表示異常終止
        //     System.exit(0); // 人為的終止虛擬機 (不要使用)

        // 2. public static log currentTimeMills():
        //     獲取當前系統時間
        //     返回的是long類型的時間毫秒值，指的是從1970-1-1 0:0:0開始到此刻的毫秒值， 1s = 1000s
        long time = System.currentTimeMillis();
        System.out.println(time);

        for (int i = 0; i < 100000; i++) {
            System.out.println("輸出了" + i);
        }

        long time2 = System.currentTimeMillis();
        System.out.println((time2 - time) / 1000.0 + "s");
    }
}
