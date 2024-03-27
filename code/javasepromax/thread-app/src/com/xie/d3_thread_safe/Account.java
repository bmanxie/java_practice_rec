package com.xie.d3_thread_safe;

public class Account {
    private String cardId; // 卡號
    private double money; // 餘額

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
        // 1. 判斷萬餘額是否足夠
        if(this.money >= money){
            System.out.println(name + "來取錢" + money + "成功");
            this.money -= money;
            System.out.println(name + "取錢成功，帳戶餘額:" + this.money);
        }else {
            System.out.println(name + "來取錢，餘額不足");
        }
    }
}
