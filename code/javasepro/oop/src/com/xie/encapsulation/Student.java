package com.xie.encapsulation;

public class Student {
    private double score; // 被隱藏

    public void setScore(double score){
        if (score >= 0 && score <= 100){
        this.score = score;
        } else {
            System.out.println("成績不合理");
        }
    }

    public double getScore(){
        return score;
    }

    public void printPass(){
        System.out.println(score >= 60 ? "及格" : "不及格");
    }
}
