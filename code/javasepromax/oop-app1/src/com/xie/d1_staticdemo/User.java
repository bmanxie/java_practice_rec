package com.xie.d1_staticdemo;

public class User {
    // 類變量
    public static int number;

    // 建構子
    public User(){
        // User.number++;
        // 在同一個類中，訪問自己的類變量可省略類名
        number++;
    }

}
