package com.xie.d6_enum;

public class Test {
    public static void main(String[] args) {
        // 目標: 認識列舉
        // 列舉類是最終類，不能被繼承
        A a1 = A.X;
        System.out.println(a1);

        // 1.列舉類是私有的，不能對外創建對象
        //A a = new A();

        // 2.列舉的第一行都是常量，記住的是列舉類的對象
        A a2 = A.Y;

        // 3. 列舉類提供一個一些額外的API
        A[] as = A.values(); // 拿到全部對象
        A a3 = A.valueOf("Z");
        System.out.println(a3.name()); // Z
        System.out.println(a3.ordinal()); // 索引

        System.out.println("================");
        B y = B.Y;
        y.go();
    }
}
