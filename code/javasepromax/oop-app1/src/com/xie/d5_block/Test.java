package com.xie.d5_block;

public class Test {
    public static void main(String[] args) {
        // 目標: 了解兩種代碼塊，特點及基本作用
        System.out.println(Student.number);
        System.out.println(Student.number);
        System.out.println(Student.schoolName);

        System.out.println("=================");
        Student s1 = new Student();
        Student s2 = new Student("有");
    }
}
