package com.xie.loop;

public class BreakAndContinueDemo8 {
    public static void main(String[] args) {
        // 目標: 學會break和continue的作用
        // 1. break: 跳出當前所在循環的執行
        for (int i = 1; i <= 5; i++){
            System.out.println("大家好");
            if (i == 3){
                // 說完三次大家好了
                break; // 停止
            }
        }

        // 2. continue 跳出這次循環，直接進入下一次執行
        for (int i = 1; i <= 5; i++){
            if (i == 3){
                // 第3天不運動
                continue;
            }
            System.out.println("運動日:" + i);
        }

        // break: 只能用在結束所在的循環，或是結束所在switch分支的執行
        // continue: 只能在循環中使用
    }
}
