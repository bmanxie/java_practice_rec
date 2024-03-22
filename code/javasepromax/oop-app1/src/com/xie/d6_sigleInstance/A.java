package com.xie.d6_sigleInstance;

public class A {
    // 餓漢式單例

    // 2. 定義一個類變量記住類的一個對象
    private static A a = new A();

    // 1. 私有化類的建構子
    private A(){

    }

    // 3. 定義一個類方法返回類的物件
    public static A getObject(){
        return a;
    }
}
