package com.xie.encapsulation;

public class Test {
    public static void main(String[] args) {
        // 掌握封裝: 合理隱藏、合理暴露
        Student s1 = new Student();
        s1.setScore(23);
        System.out.println(s1.getScore());
        s1.printPass();
    }
}
