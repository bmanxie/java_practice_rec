package com.xie.overload;

public class MethodOverLoadDemo1 {
    public static void main(String[] args) {
        // 目標: 認識函式多載(方法名稱一樣，形參不同)
        test();
        test(2);
    }

    public static void test(){
        System.out.println("====test1====");
    }
    public static void test(int a){
        System.out.println("====test2====");
    }
}
