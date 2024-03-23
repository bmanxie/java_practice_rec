package com.xie.d8_generics;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        // 目標: 認識泛型
        // 約束能操作的數據類型，並自動檢查。避免強制類型轉換，和可能出現的異常。
        ArrayList list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        // list.add(new Cat());

        for (int i = 0; i < list.size(); i++) {
            String e = (String) list.get(i);
            System.out.println(e);
        }

        System.out.println("======================");
        ArrayList<String> list1 = new ArrayList<>(); // JDK 1.7開始，後面的數據類型可以不標明
        list1.add("java1");
        list1.add("java2");
        list1.add("java3");
        // list1.add(new Cat());

        for (int i = 0; i < list1.size(); i++) {
            String e = list1.get(i);
            System.out.println(e);
        }
    }
}
class Cat{}
