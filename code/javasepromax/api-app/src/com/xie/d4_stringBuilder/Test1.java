package com.xie.d4_stringBuilder;

public class Test1 {
    public static void main(String[] args) {
        // 目標: 掌握StringBuilder的用法和作用
        // StringBuilder s = new StringBuilder(); // s ""
        StringBuilder s = new StringBuilder("北科大"); // s "北科大"

        // 1. 拼接內容
        s.append(12);
        s.append("經管系");
        s.append(true);

        // 支持鏈式編程
        s.append(921).append("實驗室").append(743);

        System.out.println(s);

        System.out.println("============");
        // 2. 反轉操作
        s.reverse();
        System.out.println(s);

        // 3. 返回字符串的長度
        System.out.println(s.length());

        // 4. 把StringBuilder對象又轉換成String類型
        String rs = s.toString();
        System.out.println(rs);
    }
}
