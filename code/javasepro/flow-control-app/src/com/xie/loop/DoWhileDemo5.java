package com.xie.loop;

public class DoWhileDemo5 {
    public static void main(String[] args) {
        // 目標: 掌握do-while循環格式，執行流程，特點及實務應用
        // 任務: 輸出多行Hello Worle!
        int i = 0;
        do{
            System.out.println("Hello World!");
            i++;
        }while (i < 3);
        System.out.println("====================");
        // 特點: 先執行再判斷
        do{
            System.out.println("Hello World!");
        }while (false);

        // 應用: 搶票系統，先搶再判斷有沒有搶到。如果先判斷再執行，會比別人慢。
    }
}
