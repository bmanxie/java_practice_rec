package com.xie.d2_inner_class2;

public class Test {
    public static void main(String[] args) {
        // 目標: 了解靜態內部類
        // 有static修飾的內部類
        // 外部類名.內部類名 對象名 = new 外部類.內部類();
        // 可以直接訪問外部類的靜態成員，不能直接訪問外部類的實例成員
        Outer.Inner in = new Outer.Inner();
        in.test();
        Outer.schoolName = "中午";
        in.test();
    }
}
