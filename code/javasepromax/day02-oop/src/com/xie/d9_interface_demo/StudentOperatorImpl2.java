package com.xie.d9_interface_demo;

import java.util.ArrayList;

public class StudentOperatorImpl2 implements StudentOperator{

    @Override
    public void printAllInfo(ArrayList<Student> students) {
        System.out.println("==========全部學生訊息如下============");
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < students.size(); i++){
            Student s = students.get(i);
            System.out.println("姓名" + s.getName() + "性別" + s.getSex() + "成績" + s.getScore());
            if(s.getSex() == '男'){
                count1++;
            }else {
                count2++;
            }
        }
        System.out.println("男生人數是:" + count1 + ", 女生人數是:" + count2);
        System.out.println("班級總人數是:" + students.size());
        System.out.println("===========================================");
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        double allscore = 0.0;
        double max = students.get(0).getScore();
        double min = students.get(0).getScore();
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if(s.getScore() > max) max = s.getScore();
            if(s.getScore() < min) min = s.getScore();
            allscore += s.getScore();
        }
        System.out.println("最高分是:" + max);
        System.out.println("最低分是:" + min);
        System.out.println("平均分" + (allscore - max - min) / (students.size() - 2));
    }
}
