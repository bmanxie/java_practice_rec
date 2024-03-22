package com.xie.d13_extends_visit;

public class C extends F{
    String name = "子類名稱";

    public void showName(){
        String name = "局部名稱";
        System.out.println(name); // 局部名稱
        System.out.println(this.name); // 子類成員變量
        System.out.println(super.name); // 父類的成員變量
    }

    @Override
    public void print1(){
        System.out.println("===子類的print1方法執行了===");
    }

    public void showMethod(){
        print1(); // 子類的
        super.print1(); // 父類的
    }

}
