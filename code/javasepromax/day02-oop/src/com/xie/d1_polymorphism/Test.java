package com.xie.d1_polymorphism;

public class Test {
    public static void main(String[] args) {
        // 目標: 認識多型，物件多型，行為多型
        // 多型的前提:
        // 有繼承/實現關係; 存在父類引用子類物件; 存在方法重寫
        // 注意事項:
        // 多型是物件、行為的多型，Java中的屬性(成員變量)不談多型

        // 1. 物件多型
        People p1 = new Teacher();
        p1.run(); // 編譯看左邊，運行看右邊
        System.out.println(p1.name); // 對於變量: 編譯看左邊，運行看左邊

        People p2 = new Student();
        p2.run();
        System.out.println(p2.name);

    }
}
