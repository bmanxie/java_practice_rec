package com.xie.d14_extends_constructor;

class F{
//    public F(){
//        System.out.println("===父類F的 無參數建構子 被執行了===");
//    }

    public F(String name, int age){

    }
}

class C extends F{
    public C(){
        // 默認存在 super();
        super("劉備", 15);
        System.out.println("===子類C的 無參數建構子 被執行了===");
    }
    public C(String name){
        // 默認存在 super();
        super("劉備", 15);
        System.out.println("===子類C的 有參數建構子 被執行了===");
    }
}

public class Test {
    public static void main(String[] args) {
        // 目標: 先認識子類建構子的特點，再掌握這個特點的使用場景
        C c = new C();
        C c2 = new C("有");

    }
}
