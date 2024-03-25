package com.xie.d1_recursion;

/**
 * 目標: 認識遞歸的形式
 */
public class RecursionTest1 {
    public static void main(String[] args) {
        test1();
    }

    // 直接方法遞歸
    public static void test1(){
        System.out.println("-----test1-----");
        test1(); // 直接方法遞歸
        // StackOverFlowError 棧溢出錯誤
    }

    // 間接方法遞歸
    public static void test2(){
        System.out.println("-----test2-----");
        test3();
    }

    public static void test3(){
        System.out.println("-----test3-----");
        test2();
    }
}
