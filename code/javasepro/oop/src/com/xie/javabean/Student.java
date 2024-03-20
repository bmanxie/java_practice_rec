package com.xie.javabean;

public class Student {
    // 私有成員變量
    private String name;
    private double score;

    // 為類提供公開的無參數建構子
    public Student() {
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
