package com.xie.d3_inner_class3;

public class Test2 {
    public static void main(String[] args) {
        // 目標: 掌握匿名內部類的使用場景
        // 通常做為參數傳輸給方法使用

//        Swimming s1 = new Swimming(){
//            @Override
//            public void swim() {
//                System.out.println("狗游泳，狗爬式");
//            }
//        };
//        go(s1);

        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("狗游泳，狗爬式");
            }
        });
    }

    // 設計一個方法，可以接收swimming介面的一切實現對象來參加游泳比賽
    public static void go(Swimming s ){
        System.out.println("開始~~~~");
        s.swim();
    }
}

// 貓和狗都要游泳
interface Swimming{
    void swim();
}
