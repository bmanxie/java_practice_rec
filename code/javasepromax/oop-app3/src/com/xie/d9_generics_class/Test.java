package com.xie.d9_generics_class;

public class Test {
    public static void main(String[] args) {
        // 目標: 掌握泛型類的定義和使用
        MyArrayLsit<String> lsit = new MyArrayLsit<>();
        lsit.add("java1");
        lsit.add("java2");
        // lsit.add(23);
        String ele = lsit.get(1);
        System.out.println(ele);

        MyClass2<Cat, String> c2 = new MyClass2<>();

        MyClass3<Dog> c3 = new MyClass3<>();

    }
}
