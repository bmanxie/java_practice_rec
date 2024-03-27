package com.xie.d4_synchronized_code;

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

    // 靜態方法建議使用 類名.class對象做為鎖對象
    public static void test(){
        synchronized (Account.class){

        }
    }

    // 小明 小紅同時過來
    public void drawMoney(double money) {
        // 先搞清楚誰取錢
        String name = Thread.currentThread().getName();
        // 1. 判斷萬餘額是否足夠
        // this正好代表共享資源，對於實例方法建議使用this做為鎖對象
        synchronized (this) {
            if(this.money >= money){
                System.out.println(name + "來取錢" + money + "成功");
                this.money -= money;
                System.out.println(name + "取錢成功，帳戶餘額:" + this.money);
            }else {
                System.out.println(name + "來取錢，餘額不足");
            }
        }
    }
}
