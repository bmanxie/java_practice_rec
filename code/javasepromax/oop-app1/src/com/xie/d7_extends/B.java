package com.xie.d7_extends;

public class B extends A{
    // 子類可以繼承父類的非私有成員
    public int k;
    private int l;
    public void print3(){
        System.out.println(i);
        print1();


        // System.out.println(j); // 不可訪問
        // print2();
    }
}
