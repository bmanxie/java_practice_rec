package com.xie.d7_thread_communication;

import java.util.ArrayList;
import java.util.List;

public class Desk {
    private List<String> list = new ArrayList<>();

    // 放一個包子的方法
    // 廚師1 廚師2 廚師3
    public synchronized void put() {
        String name = Thread.currentThread().getName();
        // 判斷是否有包子
        try {
            if(list.size() == 0){
                list.add(name + "做的包子");
                System.out.println(name + "做了一個包子");
                Thread.sleep(2000);

                // 等待自己，喚醒別人
                this.notifyAll();
                this.wait();
            }else {
                // 有包子了，不做了
                // 喚醒別人，等待自己
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //客人1 客人2
    public synchronized void  get() {
        String name = Thread.currentThread().getName();
        try {
            if(list.size() == 1){
                // 有包子，吃了
                System.out.println(name + "吃了" + list.get(0));
                list.clear();
                Thread.sleep(1000);
                this.notifyAll();
                this.wait();
            }else {
                // 沒有包子
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
