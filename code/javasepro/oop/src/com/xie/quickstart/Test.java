package com.xie.quickstart;

public class Test {
    public static void main(String[] args) {
        // 物件導向

        // 學生1
        Student s1 = new Student();
        s1.name = "張三";
        s1.chinese = 100;
        s1.math = 90;
        s1.printTotalScore();
        s1.printAverageScore();


        // 學生2
        Student s2 = new Student();
        s2.name = "李四";
        s2.chinese = 88;
        s2.math = 74;
        s2.printTotalScore();
        s2.printAverageScore();

        System.out.println(s1);
        System.out.println(s2);
    }
}
