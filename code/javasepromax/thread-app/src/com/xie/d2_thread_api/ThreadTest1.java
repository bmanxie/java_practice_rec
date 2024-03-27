package com.xie.d2_thread_api;

/**
 * 目標: 掌握Thread的常用方法
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread("1號線程");
        // t1.setName("1號線程");
        t1.start();
        System.out.println(t1.getName()); // Thread-0

        Thread t2 = new MyThread("2號線程");
        // t2.setName("2號線程");
        t2.start();
        System.out.println(t2.getName()); // Thread-1

        // 主線程對象名字
        // 哪個線程執行他，就得到哪個線程對象
        Thread m = Thread.currentThread();
        m.setName("我是主線程");
        System.out.println(m.getName()); // main


        for (int i = 0; i <= 5; i++) {
            System.out.println("main線程輸出: " + i);
        }
    }
}
