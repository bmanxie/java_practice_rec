package com.xie.define;

import java.util.Scanner;

public class ArrayTest6 {
    public static void main(String[] args) {
        // 目標: 完成評審打分案例
        // 任務: 可以輸入6名評審的評分，登入完畢後輸出平均分為選手得分
        // 1. 建立一個動態初始化數組，後期儲存6個評審打分
        double[] scores = new double[6];

        Scanner sc = new Scanner(System.in);
        
        // 2. 遍歷數組內的每個位置，輸入評審分數，存到數組中
        for (int i = 0; i < scores.length; i++) {
            System.out.println("輸入第" + (i + 1) + "個評審分數:");
            double score = sc.nextDouble();
            scores[i] = score;
        }

        // 3. 遍歷數組中的元素求和
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("選手得分:" + sum / scores.length);
    }
}
