package com.xie.loop;

public class WhileTest4 {
    public static void main(String[] args) {
        // 任務: 一張紙摺疊幾次才是聖母峰的高度?
        double peakHeigh = 8848860; // 山峰高度
        double paperThickness = 0.1; // 紙張厚度
        int count = 0;
        while (paperThickness < peakHeigh){
            paperThickness *= 2;
            count += 1;
        }
        System.out.println("摺疊次數:" + count);
        System.out.println("最後紙張厚度:" + paperThickness);
    }
}
