package com.xie.d2_thread_api;

public class MyThread extends Thread{
    public MyThread(String name){
        super(name); // 為當前線程設置名字   // 調出父類Tread的有參構造器 public Thread(String name)
    }

    @Override
    public void run(){
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 3; i++) {
            System.out.println(t.getName() + "子線程輸出: " + i);
        }
    }
}
