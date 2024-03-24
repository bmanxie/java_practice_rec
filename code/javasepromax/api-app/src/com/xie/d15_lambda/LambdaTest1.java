package com.xie.d15_lambda;

public class LambdaTest1 {
    public static void main(String[] args) {
        // 目標: 認識lambda表達式
        // 用來簡化匿名內部類的寫法

//        Animal a = new Animal(){
//            @Override
//            public void run(){
//                System.out.println("狗跑得快");
//            }
//        };
//        a.run();

        // 注意: Lambda表達式並不是說能簡化全部匿名內部類的寫法，只能簡化函數式介面的匿名內部類
        // 函數式介面: 只有一個抽象方法的介面
        // @FunctionalInterface註解的就是函數式介面
//        Animal a = () -> {
//            System.out.println("狗跑得快");
//        };
//        a.run();


        Swimming s = () -> {
            System.out.println("學生在游泳");
        };
        s.swim();

    }
}

interface Swimming{
    void swim();
}

abstract class Animal{
    public abstract void run();
}