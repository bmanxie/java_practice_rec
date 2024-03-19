package com.xie.quickstart;

public class Student {
    String name;
    double chinese;
    double math;

    public void printTotalScore(){
        System.out.println(name + "的總成績是:" + (chinese + math));
    }

    public void printAverageScore(){
        System.out.println(name + "的平均成績是" + (chinese + math) / 2.0);
    }
}
