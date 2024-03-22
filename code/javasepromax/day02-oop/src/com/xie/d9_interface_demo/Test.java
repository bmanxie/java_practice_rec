package com.xie.d9_interface_demo;

public class Test {
    public static void main(String[] args) {
        // 目標: 完成班級學生訊息管理的案例
        // 方案1. 打印全班學生訊息、全部學生平均分
        ClassManager clazz = new ClassManager();
        clazz.printInfo();
        clazz.printScore();

        // 方案2. 打印全班學生訊息(包含男女人數)，全班平均分(要求去掉最高及最低分後的平均)

    }
}
