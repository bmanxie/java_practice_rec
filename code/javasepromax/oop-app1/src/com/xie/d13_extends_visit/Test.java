package com.xie.d13_extends_visit;

public class Test {
    public static void main(String[] args) {
        // 子類方法訪問其他成員(成員變量，成員方法), 依照就近原則
        // 局部範圍 -> 子類成員範圍 -> 父類範圍 -> 都找不到就報錯
        // 子父類中出現重名的成員，優先使用子類，一定要用父類則要用: super
        C c = new C();
        c.showName();
        c.showMethod();
    }
}