package com.xie.d7_thread_communication;

/**
 * 目標: 了解線程通信
 */
public class ThreadTest {
    public static void main(String[] args) {
        // 需求: 三個生產者線程，負責生產包子，每個線程只能生產一個包子在桌上
        //      兩個消費者線程，負責吃包子，每次只能從桌上拿一個包子吃
        Desk desk = new Desk();

        // 創建3個生產者線程(3個廚師)
        new Thread(() -> {
            while (true) {
                desk.put();
            }
        }, "廚師1").start();

        new Thread(() -> {
            while (true) {
                desk.put();
            }
        }, "廚師2").start();

        new Thread(() -> {
            while (true) {
                desk.put();
            }
        }, "廚師3").start();

        // 創建2個消費者線程(2個客人)
        new Thread(() -> {
            while (true) {
                desk.get();
            }
        }, "客人1").start();

        new Thread(() -> {
            while (true) {
                desk.get();
            }

        }, "客人2").start();
    }
}
