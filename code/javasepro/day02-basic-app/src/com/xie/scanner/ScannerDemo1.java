package com.xie.scanner;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        // 1. import : IDEA工具會自動導入
        // 2. 抄代碼 : 得到鍵盤掃描器(東西)
        Scanner sc = new Scanner(System.in);

        // 3. 開始，調用sc功能，用來接收用戶輸入
        System.out.println("輸入您的年齡");
        int age = sc.nextInt(); // 會等待用戶輸入年齡
        System.out.println("您的年齡:" + age);

        System.out.println("輸入您的名字");
        String name = sc.next(); // 等待用戶輸入字符
        System.out.println(name + "歡迎進入系統");
    }
}
