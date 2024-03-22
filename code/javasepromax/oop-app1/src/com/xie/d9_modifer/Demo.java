package com.xie.d9_modifer;

public class Demo {
    public static void main(String[] args) {
        // 目標: 掌握不同修飾符的作用
        Parent f = new Parent();
        // f.privateMethod(); // 不可訪問私有
        f.method();
        f.protectedMethod();
        f.publicMethod();

    }
}
