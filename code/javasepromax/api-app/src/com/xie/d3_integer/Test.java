package com.xie.d3_integer;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 目標: 包裝類的使用
        // Integer a1 = new Integer(12);
        Integer a2 = Integer.valueOf(12);
        System.out.println(a2);

        // 自動裝箱: 可以自動把基本類型的數據轉成對象
        Integer a3 = 13;

        // 自動拆箱: 自動把包裝類型的對象轉換成基本類型
        int a4 = a3;

        // 泛型和集合，不支持基本數據類型，只能支持引用類型數據
        // ArrayList<int> list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12); // 自動裝箱
        list.add(13); // 自動裝箱

        int re = list.get(1); // 自動拆箱

        System.out.println("===============");
        // 1. 把基本類型數據轉換成字符串
        Integer a = 23;
        String rs1 = Integer.toString(a); // "23"
        System.out.println(rs1 + 1); // "231"

        String rs2 = a.toString(); // "23"
        System.out.println(rs2 + 1); // "231"

        String rs3 = a + "";
        System.out.println(rs3 + 1);

        // 2. 把字符串類型轉換成對應的基本類型
        String ageStr = "29";
        // int ageI = Integer.parseInt(ageStr); // 29
        int ageI = Integer.valueOf(ageStr); // 29
        System.out.println(ageI + 1); // 30

        String scoreStr = "88.5";
        // double score = Double.parseDouble(scoreStr); // 88.5
        double score = Double.valueOf(scoreStr); // 88.5
        System.out.println(score + 0.5); // 89

    }
}
