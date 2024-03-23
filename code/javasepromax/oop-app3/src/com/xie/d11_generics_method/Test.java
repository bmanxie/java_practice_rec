package com.xie.d11_generics_method;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 目標: 掌握泛型方法的定義和使用
        String rs = test("Java");
        System.out.println(rs);

        Dog d = test(new Dog());
        System.out.println(d);

        // 所有汽車可以一起參加比賽
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new BMW());
        cars.add(new Benz());
        go(cars);

        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        go(bmws);

        ArrayList<Benz> benzs = new ArrayList<>();
        benzs.add(new Benz());
        benzs.add(new Benz());
        go(benzs);
    }


    // 通配符: ? , 使用泛型時可以代表一切類型
    // ? extends Car(上限) 必須是Car或是Car的子類
    // ? super Car(下陷) 必須是Car或是Car的父類
    public static void go(ArrayList<? extends Car> cars){

    }
//    public static <T extends Car> void go(ArrayList<T> cars){
//
//    }

    public static <T> T test(T t){
        return t;
    }
}