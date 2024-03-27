package com.xie.d1_create_thread;

/**
 * 1. 讓子類繼承Thread類
 */
public class Mythread extends Thread{
    // 2. 必須重寫Thread類的run方法
    @Override
    public void run(){
        // 描述線程的執行任務
        for (int i = 1; i <= 5; i++){
            System.out.println("子線程Mythread輸出: " + i);
        }
    }
}
