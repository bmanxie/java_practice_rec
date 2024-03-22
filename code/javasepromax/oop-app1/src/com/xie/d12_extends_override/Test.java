package com.xie.d12_extends_override;

public class Test {
    public static void main(String[] args) {
        // 目標: 認識方法重寫，掌握方法重寫的常見應用場景
        B b = new B();
        b.print1();
        b.print2(12,22);

        System.out.println("==============");
        Student s = new Student("劉備", 20);
        // System.out.println(s.toString());
        System.out.println(s);
    }
}
