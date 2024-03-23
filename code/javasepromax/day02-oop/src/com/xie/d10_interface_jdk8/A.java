package com.xie.d10_interface_jdk8;

public interface A {
    /**
     * 1. 默認方法: 必須使用default修飾，默認會被public修飾
     *    實例方法: 對象的方法，必須使用實現類的對象來訪問
     */
    default void test1(){
        System.out.println("===默認方法===");
        test2();
    }

    /**
     * 2. 私有方法: 必須使用private修飾(JDK 9 才開始支援)
     *    實例方法: 對象的方法
     */
    private void test2(){
        System.out.println("===私有方法===");
    }

    /**
     * 3. 靜態方法: 必須使用static修飾，默認用public修飾
     */
    static void test3(){
        System.out.println("===靜態方法===");
    }

    void test4();
}
