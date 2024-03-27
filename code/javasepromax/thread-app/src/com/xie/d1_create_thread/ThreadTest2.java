package com.xie.d1_create_thread;

/**
 * 目標: 掌握多線程的創建方式二: 支援Runnable接口
 */
public class ThreadTest2 {
    public static void main(String[] args) {
        // 3. 創建任務對象
        Runnable target = new MyRunnable();
        // 4. 把任務對象交給一個線程對象處理
        // public Thread(Runnable target)
        new Thread(target).start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("主線程main輸出 === " + i);
        }
    }
}
