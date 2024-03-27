package com.xie.d2_thread_api;

/**
 * 目標: 掌握sleep方法，join方法的作用
 */
public class ThreadTest2 {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            // 休眠5s
            if(i==3){
                // 會讓當前線程暫停5秒，再繼續執行
                Thread.sleep(5000);
            }
        }


        // join方法的作用: 讓當前調用這個方法的線程先執行完
        Thread t1 = new MyThread("1號線程");
        t1.start();
        t1.join();

        Thread t2 = new MyThread("2號線程");
        t2.start();
        t2.join();

        Thread t3 = new MyThread("3號線程");
        t3.start();
        t3.join();
    }
}
