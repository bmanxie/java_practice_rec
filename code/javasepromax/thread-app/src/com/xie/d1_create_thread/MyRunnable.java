package com.xie.d1_create_thread;

/**
 *  1. 定義一個任務類，實現Runnable接口
 */
public class MyRunnable implements Runnable{
    // 2. 重寫runnable的run方法
    @Override
    public void run(){
        // 線程要執行的任務
        for (int i = 1; i <= 5; i++) {
            System.out.println("子線程輸出 === " + i);
        }
    }

}
