package com.xie.string;

public class StringDemo1 {
    public static void main(String[] args) {
        // 1. 直接雙引號得到字符串
        String name = "Taipei";
        System.out.println(name);

        // 2. new String 創建字符串段向並調用建構子初始化字符串
        String rs1 = new String();
        System.out.println(rs1); //

        String rs2 = new String("Taipei");
        System.out.println(rs2);
    }
}
