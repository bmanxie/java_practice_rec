package com.xie._d11_interface_attention;

public class Test2 {
    public static void main(String[] args) {
        // 目標: 了解使用介面的注意事項
        Child c = new Child();
        c.run();
    }
}

// 1. 一個介面繼承多個介面，如果多個介面中存在方法簽名衝突，則此時不支援多繼承
interface I{
    void test1();
}
interface J{
    String test1();
}
//interface K extends I,J{
//
//}

// 2. 一個類實現多個介面，如果多個介面存在方法簽名衝突，此時不支援多實現
//class E implements I, J{
//
//}

// 3. 一個類繼承父類，又同時實現了介面，父類和介面有同名的默認方法，實現類會優先用父類的
class Parents{
    public void run(){
        System.out.println("===父類的run被執行了===");
    }
}

interface IT{
    default void run(){
        System.out.println("===介面的run被執行了===");
    }
}

class Child extends Parents implements IT{
}

// 4. 一個類實現了多個介面，多個介面中存在同名的默認方法，可以不衝突，這個類重寫該方法即可
interface IT1{
    default void test(){
        System.out.println("IT1");
    }
}

interface IT2{
    default void test(){
        System.out.println("IT2");
    }
}

class N implements IT1, IT2{
    @Override
    public void test(){
        System.out.println("自己的test()");
    }
}
