package com.xie;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        // 目標: 評審打分
        System.out.println("當前選手得分是:" + getAverageScore(5));
    }

    public static double getAverageScore(int number){
        // 定義動態初始化數組，存入評審評分
        int[] scores = new int[number];

        // 遍歷數組每個位置，依次輸入評審分數
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < scores.length; i++){
            System.out.println("輸入第"+ (i+1) + "位評審分數");
            int score = sc.nextInt();
            scores[i] = score;
        }

        // 從數組中計算總分，找出最高分、最低分
        int sum = 0;
        int max = scores[0]; // 找最大值
        int min = scores[0]; // 找最小值

        // 遍歷數組找出這些數據
        for(int i = 0; i < scores.length; i++){
            int score = scores[i];
            // 求和
            sum += score;

            // 求最大
            if (max < score){
                max = score;
            }

            // 求最小
            if (min > score){
                min = score;
            }
        }

        // 計算平均分並返回
        return 1.0 * (sum - max - min) / (number - 2); // 確保返回小數因此前面 * 1.0
    }
}
