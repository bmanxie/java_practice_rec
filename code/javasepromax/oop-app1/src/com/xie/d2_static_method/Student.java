package com.xie.d2_static_method;

public class Student {
    double score;
    // 類方法
    public static void printHelloWorld(){
        System.out.println("Hello World!");
        System.out.println("============");
    }

    // 實例方法(物件的方法)
    public void printPass(){
        System.out.println("成績" +
                (this.score >= 60 ? "及格" : "不及格" ));
    }
}
