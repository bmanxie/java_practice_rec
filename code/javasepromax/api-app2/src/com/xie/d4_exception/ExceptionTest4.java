package com.xie.d4_exception;

import java.util.Scanner;

/**
 * 目標: 掌握異常的處理方式: 捕獲異常，嘗試修復
 */
public class ExceptionTest4 {
    public static void main(String[] args) {
        try {
            System.out.println(getMoney());
        } catch (Exception e) {
            System.out.println("請輸入合理的數字");
        }
    }

    public static double getMoney(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("輸入想要的金額:");
            double money = sc.nextDouble();
            if (money >= 0){
                return money;
            }else{
                System.out.println("價格不合適");
            }
        }
    }
}
