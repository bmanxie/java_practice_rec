package com.xie.d1_create_thread;

/**
 * 目標: 掌握線程的創建方式一: 繼承Thread類
 */
public class ThreadTest1 {
    // main方法由一條默認的主線程負責執行
    public static void main(String[] args) {
        // 3. 創建Mythread線程類的對象代表一個線程
        Thread t = new Mythread();
        // 4. 啟動線程(自動執行run方法的)
        // 要調用start方法!!
        t.start(); // main線程、t線程

        // 不要把主線程任務放在啟動子線程之前
        for (int i = 1; i <= 5; i++){
            System.out.println("主線程main輸出: " + i);
        }
    }
}
