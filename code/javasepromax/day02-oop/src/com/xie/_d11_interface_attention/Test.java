package com.xie._d11_interface_attention;

public class Test {
    public static void main(String[] args) {
        // 目標: 理解介面的多繼承
        // 一個介面可以繼承多個介面
    }
}

interface A{
    void test1();
}

interface B{
    void test2();
}

interface C{

}

interface D extends C,B,A{

}

class E implements D{

    @Override
    public void test1() {

    }

    @Override
    public void test2() {

    }
}