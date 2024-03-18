package com.xie.loop;

public class WhileDemo3 {
    public static void main(String[] args) {
        // 目標: 掌握while循環的格式及理解流程
        // 知道循環幾次用for, 不知道幾次用while
        // while (循環條件){
        //      循環語句(重複執行的代碼);
        //      跌代語句;
        // }
        // 任務: 輸出多行Hello World!
        int i = 0;
        while (i < 5){
            // i = 0 1 2 3 4
            System.out.println(i);
            i++;
        }
    }
}
