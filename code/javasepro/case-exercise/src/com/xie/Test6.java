package com.xie;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        // 目標: 搶紅包
        int[] moneys = {6, 88, 666, 888, 6688};
        start(moneys);
    }

    public static void start(int[] moneys){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        // 定義一個for迴圈，抽獎次數
        for(int i = 0; i < moneys.length; i++){
            System.out.println("輸入任意內容抽獎:");
            sc.next();

            // 抽出一個隨機金額的紅包
            while (true){
                int index = r.nextInt(moneys.length);
                int money = moneys[index];

                // 判斷紅包是否不為0
                if(money != 0){
                    System.out.println("恭喜抽中" + money + "元");
                    moneys[index] = 0;
                    break;
                }
            }

        }
        System.out.println("活動結束");
    }
}
