package com.xie.d8_thread_pool;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        // 任務是做什麼的?
        System.out.println(Thread.currentThread().getName() + " ==> 輸出777 ");
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
