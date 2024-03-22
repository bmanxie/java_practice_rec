package com.xie.d6_sigleInstance;

public class B {
    // 2. 定義一個類變量，儲存這個類的一個對象
    private static B b;
    // 1. 把類的建構子私有
    private B(){

    }

    // 3. 定義一個類方法，這個方法要保證第一次調用時才創建一個對象，後面調用都會用這同一個對象返回
    public static B getInstance(){
        if(b == null){
            System.out.println("第一次創建物件");
            b = new B();
        }
        return b;
    }
    public void run(){
        System.out.println("run");
    }
}
