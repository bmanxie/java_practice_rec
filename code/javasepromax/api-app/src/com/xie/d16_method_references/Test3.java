package com.xie.d16_method_references;

/**
 * 目標: 建構子引用(理解語法)
 */
public class Test3 {
    public static void main(String[] args) {
        // 1. 創建這個介面的匿名內部類對象
//        CreateCar cc = new CreateCar() {
//            @Override
//            public Car create(String name, double price) {
//                return new Car(name, price);
//            }
//        };

        // 留下參數列表、方法體其他都去掉，加上箭頭，就變成Lambda表達式
        // CreateCar cc = (String name, double price) -> {return new Car(name, price);};
        // 參數類型可省略(如果參數只有一個，小括號也可省略)
        // 方法體只有一行代碼，可省略大括號，同時省略分號，如果是return語句，也必須去掉return!
        // CreateCar cc = ( name, price) -> new Car(name, price);

        // 建構子引用
        // 類名::new
        // 如果Lambda表達式只是在創建對象，並且前後參數情況一致，就可以使用建構子引用
        CreateCar cc = Car::new;

        Car c = cc.create("Benz", 188.8);
        System.out.println(c);
        System.out.println(c.getName());
        System.out.println(c.getPrice());

    }
}

interface CreateCar{
    Car create(String name, double price);
}
