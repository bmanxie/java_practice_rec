package com.xie.variable;

public class VariableDemo1 {
    public static void main(String[] args) {
        // 目標: 認識變量，掌握使用變量的好處、特點、使用場景
        // 變量用來儲存數據，本質是內存的一塊區域
        // 可以想成一個盒子，用來裝數據
        // int :整數 , double : 小數
        // 1. 定義一個整型變量記住整數
        // 數據類型 變量名 = 整數
        int age = 25;
        System.out.println(age);

        // 2. 記住成績
        double score = 99.2;
        System.out.println(score);

        System.out.println("=================================");

        // 3. 使用變量的好處: 方便擴展、維護
        int number = 666;
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println("=================================");

        // 4. 變量的特點: 數值可以被替換
        int age2 = 18;
        System.out.println(age2);
        age2 = 19; // 讓age2 賦值19
        System.out.println(age2);
        age2 = age2 + 1; // 19+1
        System.out.println(age2);
        System.out.println("=================================");

        // 5. 需求: 錢包有9.5元，收到10元，又發出5元，輸出各階段錢包情形。
        double money = 9.5; // 原本的錢
        System.out.println(money);
        money = money + 10; // 收到10
        // money += 10 也能得到同樣結果
        System.out.println(money);
        money = money - 5; // 付出5元
        // money -= 5
        System.out.println(money);

    }
}
