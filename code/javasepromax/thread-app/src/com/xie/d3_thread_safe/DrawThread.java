package com.xie.d3_thread_safe;

public class DrawThread extends Thread{
    private Account acc;
    public DrawThread(Account acc, String name){
        super(name);
        this.acc = acc;
    }
    @Override
    public void run(){
        // 取錢
        acc.drawMoney(100000);
    }
}
