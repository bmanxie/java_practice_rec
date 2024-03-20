package com.xie.constructor;

public class Student {
    String name;
    double score;

    public Student(){
        System.out.println("無參數建構子被執行了");
    }

    public Student(String name, double score){
        System.out.println("有參數建構子被執行了");
        this.name = name;
        this.score = score;
    }
}
