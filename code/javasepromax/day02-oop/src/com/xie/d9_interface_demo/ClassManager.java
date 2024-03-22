package com.xie.d9_interface_demo;

import java.util.ArrayList;

public class ClassManager {
    private ArrayList<Student> students = new ArrayList<>();
    private StudentOperator studentOperator = new StudentOperatorImpl1(); // 方案1
    //private StudentOperator studentOperator = new StudentOperatorImpl2(); // 方案2

    public ClassManager(){
        students.add(new Student("迪例熱八", '女', 99));
        students.add(new Student("周杰倫", '男', 88));
        students.add(new Student("蔡依林", '女', 90));
        students.add(new Student("王力宏", '男', 68));
    }

    // 打印全班全部學生的訊息
    public void printInfo(){
        studentOperator.printAllInfo(students);
    }

    // 打印全班學生的平均分
    public void printScore(){
        studentOperator.printAverageScore(students);
    }

}
