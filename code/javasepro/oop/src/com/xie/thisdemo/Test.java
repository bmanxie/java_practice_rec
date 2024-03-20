package com.xie.thisdemo;

public class Test {
    public static void main(String[] args) {
        // 目標: 學習this用法
        // this 用來得到當前物件
        // 當成員變量和方法內部變量相同時，用來解決訪問衝突用
        Student s1 = new Student();
        System.out.println(s1);
        s1.pintThis();

        Student s2 = new Student();
        s2.score = 145;
        s2.printPass(122);
    }
}
