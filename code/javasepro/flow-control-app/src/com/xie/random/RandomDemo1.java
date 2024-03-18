package com.xie.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        // 目標: 掌握使用Random生成隨機數
        // 1. 導入包
        // 2. 創建一個Random對象，用於生成隨機數
        Random r = new Random();
        // 3. 使用Random提供的功能: nextInt得到隨機數
        for (int i = 1; i <= 20; i++) {
            int data = r.nextInt(10); // 0~9
            System.out.println(data);
        }

        System.out.println("=====================");
        for (int i = 1; i <= 20; i++) {
            int data2 = r.nextInt(10) + 1; // 1~10
            System.out.println(data2);
        }
    }
}
