package com.xie.string;

import java.util.Scanner;

public class StringTest4 {
    public static void main(String[] args) {
        // 1. 開發登入介面，可錯誤3次
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("輸入帳號");
            String loginName = sc.next();
            System.out.println("輸入密碼");
            String passWord = sc.next();

            // 調用登入方法
            boolean rs = login(loginName, passWord);
            if(rs){
                System.out.println("登入成功");
                break; // 跳出循環，代表成功
            }else {
                System.out.println("帳號或密碼錯誤");
            }
        }
    }

    // 開發一個登入方法: 接收用戶的帳號密碼，返回確認結果
    public static boolean login(String loginName, String passWord){
        // 準備正確的帳號密碼
        String okLoginName = "ntut";
        String okPassWord = "111578048";

        // 判斷是否成功
        /*
        if (okLoginName.equals(loginName) && okPassWord.equals(passWord)){
            return true;
        }else {
            return false;
        }
        */
        return okLoginName.equals(loginName) && okPassWord.equals(passWord); // 直接比較後就是返回true/false
    }
}
