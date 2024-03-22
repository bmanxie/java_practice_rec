package com.xie.d5_abstract2;

public class Test {
    public static void main(String[] args) {
        // 目標: 掌握抽象類好處
        Animal c = new Cat();
        c.setName("小叮噹");
        c.cry();
        Animal d = new Dog();
        d.setName("英雄");
        d.cry();

    }
}
