package com.xie.loop;

public class ForDemo1 {
    public static void main(String[] args) {
        // 目標: 掌握for迴圈的格式，理解執行流程
        // for (初始話語句; 循環條件; 跌代語句;){
        //          循環體(重複執行的代碼)
        // }
        // 任務: 輸出多行Hello World!
        /**
            流程:
                首先執行初始化 int i = 0;
                i = 0, 判斷循環條件 0 < 3, 返回true, 進入循環中輸出第一行Hello World!，接著執行 i++
                i = 1, 判斷循環條件 1 < 3, 返回true, 進入循環中輸出第一行Hello World!，接著執行 i++
                i = 2, 判斷循環條件 2 < 3, 返回true, 進入循環中輸出第一行Hello World!，接著執行 i++
                i = 3, 判斷循環條件 3 < 3, 返回false, 循環結束
         */
        for (int i = 0; i < 3; i++){
            System.out.println("Hello World!");
        }
    }
}
