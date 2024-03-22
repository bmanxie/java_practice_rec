package com.xie.d3_final;

public class Test {
    /**
     * 常量: public static final 修飾的成員變量，建議名稱全部大寫，多個單詞下畫線連接
     */
    public static final String SCHOOL_NAME = "北科";
    public static void main(String[] args) {
        // 目標: 認識final的作用
        // 3. final可以修飾變量總規則，有且僅能賦值一次
        /*
            變量:
                一、局部變量
                二、成員變量
                    1. 靜態成員變量
                    2. 實例成員變量
         */
        final int a;
        a = 12;
        // a = 13; // 第二次賦值，出錯了

        final double r = 3.14;
        // r = 0.1 // 第二次賦值，出錯了

        // SCHOOL_NAME = "亞洲"; // 第二次賦值，出錯了
    }
}

// 1. final修飾類，類不能被繼承了
final class A{}
// final class B extends A()

// 2. final修飾方法，方法不能被重寫
class C{
    public final void test(){

    }
}
class D extends C{
//    @Override
//    public void test(){
//
//    }
}

