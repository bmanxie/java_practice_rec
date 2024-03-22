package com.xie.d11_extends_feature;

public class Test {
    public static void main(String[] args) {
        // 目標: 掌握繼承的兩個注意事項
        // 1. Java是單繼承的，一個類只能繼承一個父類; Java不支持多繼承，但支持多層繼承
        // 2. Object類是Java中所有類的祖先
    }
}

class A{} // class A extends Object{}
class B extends A{}
// class C extends B, A{} 不能多繼承
class D extends B{}

