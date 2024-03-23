package com.xie.d1_api_object;

public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 目標: 掌握Object類的對象克隆方法
        // 1. protected Object clone() : 對象克隆
        // 2. 淺克隆: 基本類型數據拷貝、字符串拷貝地址、其他對象也拷貝地址
        // 3. 深克隆: 基本類型數據拷貝、字符串拷貝地址、其他對象不會拷貝地址，會創建新對象
        User u1 = new User(1,"劉備","wp333",new double[]{91.5, 78.0});
        System.out.println(u1.getId());
        System.out.println(u1.getUsername());
        System.out.println(u1.getPassword());
        System.out.println(u1.getScores());
        System.out.println("=================");
        User u2 = (User) u1.clone();
        System.out.println(u2.getId());
        System.out.println(u2.getUsername());
        System.out.println(u2.getPassword());
        System.out.println(u2.getScores());

        System.out.println("=================");
        System.out.println(u1 == u2);


    }
}
