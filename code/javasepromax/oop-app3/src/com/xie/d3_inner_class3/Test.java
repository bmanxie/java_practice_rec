package com.xie.d3_inner_class3;

public class Test {
    public static void main(String[] args) {
        // 目標: 認識匿名內部類，並掌握作用
        // new 類或介面(參數值..){
        //      類體(一般是重寫);
        // };

//        Animal a = new Cat();
//        a.cry();

        // 1. 把這個匿名內部類編譯成子類，然後會立即創建一個子類對象出來
        Animal a =new Animal(){
            @Override
            public void cry() {
                System.out.println("喵喵喵");
            }
        };
        a.cry();

    }
}

abstract class Animal{
    public abstract void cry();
}

//class Cat extends Animal{
//    @Override
//    public void cry() {
//        System.out.println("喵喵喵");
//    }
//}
