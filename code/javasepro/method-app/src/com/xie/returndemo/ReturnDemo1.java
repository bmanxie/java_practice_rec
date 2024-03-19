package com.xie.returndemo;

public class ReturnDemo1 {
    public static void main(String[] args) {
        // 目標: 掌握return單獨使用; 在無返回值函式中的作用: 跳出並結束當前方法
        System.out.println("程序開始");
        chu(6,2);
        System.out.println("程序結束");
    }

    public static void chu(int a, int b){
        if (b == 0){
            System.out.println("不可為0");
            return; // 跳出並結束
        }
        int c = a / b;
        System.out.println("除法結果是" + c);
    }
}
