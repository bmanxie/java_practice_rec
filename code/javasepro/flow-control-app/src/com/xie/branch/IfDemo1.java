package com.xie.branch;

public class IfDemo1 {
    public static void main(String[] args) {
        // 目標: 掌握if分支的三種形式和用法
        // 1. 目標分數是否及格( >= 60)
        double score1 = 78.5;
        if (score1 >= 60){
            System.out.println("及格");
        }

        // 2. 目標分數是否及格， (60 > )則輸出不及格
        double score2 = 59;
        if (score2 >= 60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }

        // 3. 目標成績處在哪一等級。[0,60) D [60,80) C [80,90) B [90,100) A
        double score3 = 86;
        if (score3 >= 0 && score3 < 60){
            System.out.println("成績為:D");
        }else if (score3 >= 60 && score3 < 80){
            System.out.println("成績為:C");
        }else if (score3 >= 80 && score3 < 90){
            System.out.println("成績為:B");
        }else if (score3 >= 90 && score3 <= 100){
            System.out.println("成績為:A");
        }else {
            System.out.println("成績輸入錯誤");
        }
    }
}
