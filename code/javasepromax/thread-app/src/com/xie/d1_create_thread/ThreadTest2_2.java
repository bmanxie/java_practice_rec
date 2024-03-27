package com.xie.d1_create_thread;

/**
 * 目標: 掌握多線程創建方式二的匿名內部類寫法
 */
public class ThreadTest2_2 {
    public static void main(String[] args) {
        // 1. 直接創建Runnable接口的匿名內部類形式(任務對象)
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("子線程1輸出: " + i);
                }
            }
        };

        new Thread(target).start();

        // 簡化形式1:
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("子線程2輸出: " + i);
                }
            }
        }).start();

        // 簡化方式2: // 因為是函數式接口，因此能用lambda簡化
        new Thread(() -> {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("子線程3輸出: " + i);
                }
        }).start();


        for (int i = 1; i <= 5; i++) {
            System.out.println("主線程main輸出: " + i);
        }
    }
}
