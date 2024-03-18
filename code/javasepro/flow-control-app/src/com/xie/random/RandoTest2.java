package com.xie.random;

import java.util.Random;
import java.util.Scanner;

public class RandoTest2 {
    public static void main(String[] args) {
        // 猜數字
        /** 任務說明:
         生成1-100的隨機數字
         在死循環內讓用戶不斷猜
         每次輸入猜測的數字，會提示過大或過小，猜中結束遊戲
        */
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int luckyNumber = r.nextInt(100) + 1; // 0-100

        while (true){
            System.out.println("輸入猜測的數字:");
            int guessNumber = sc.nextInt();
            if (guessNumber > luckyNumber){
                System.out.println("輸入的數字過大");
                System.out.println(".....");
            }else if (guessNumber < luckyNumber){
                System.out.println("輸入的數字過小");
                System.out.println(".....");
            }else {
                System.out.println("恭喜答對");
                break;
            }
        }
    }
}
