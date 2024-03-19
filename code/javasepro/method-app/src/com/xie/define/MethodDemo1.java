package com.xie.define;

public class MethodDemo1 {
    public static void main(String[] args) {
        // 目標: 掌握定義方法的完整格式，了解好處
        // 修飾符 返回值類型 方法名(形參){
        //      方法體代碼(需要執行的功能代碼)
        //      return 返回值;
        // }
        // 任務: 很多工程師都要進行2整數求和的工作

        // 1. 李
        int rs = sum(10,20);
        System.out.println("和是:" + rs);

        // 2. 張
        int rs2 = sum(30,50);
        System.out.println("和是:" + rs2);
    }


    public static int sum(int a,int b){
    //  修飾符    值類型 方法名  形參
        int c = a + b;  // 執行代碼
        return c;  // 返回值
    }
}
