package com.xie.d6_synchronized_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardId; // 卡號
    private double money; // 餘額
    // 創建了一個鎖對象
    private final Lock lk = new ReentrantLock();


    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


    // 小明 小紅同時過來
    public void drawMoney(double money) {
        // 先搞清楚誰取錢
        String name = Thread.currentThread().getName();
        lk.lock(); // 加鎖
        // 1. 判斷萬餘額是否足夠
        try {
            if(this.money >= money){
                System.out.println(name + "來取錢" + money + "成功");
                this.money -= money;
                System.out.println(name + "取錢成功，帳戶餘額:" + this.money);
            }else {
                System.out.println(name + "來取錢，餘額不足");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lk.unlock(); // 解鎖
        }
    }
}
