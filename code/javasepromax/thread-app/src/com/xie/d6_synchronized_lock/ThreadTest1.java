package com.xie.d6_synchronized_lock;

import com.xie.d5_synchronized_method.Account;
import com.xie.d5_synchronized_method.DrawThread;

/**
 * 目標: 線程同步: lock鎖
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        // 1. 創建一個帳戶對象，代表兩人的共享帳戶
        com.xie.d5_synchronized_method.Account acc = new com.xie.d5_synchronized_method.Account("ICBC-110",100000);
        // 2. 創建兩個線程，分別代表小明、小紅，再去同一個帳戶對象取錢10萬
        new com.xie.d5_synchronized_method.DrawThread(acc, "小明").start(); // 小明
        new com.xie.d5_synchronized_method.DrawThread(acc, "小紅").start(); // 小紅


        com.xie.d5_synchronized_method.Account acc2 = new Account("ICBC-112",100000);
        // 2. 創建兩個線程，分別代表小明、小紅，再去同一個帳戶對象取錢10萬
        new com.xie.d5_synchronized_method.DrawThread(acc2, "小黑").start(); // 小黑
        new DrawThread(acc2, "小白").start(); // 小白

    }
}
