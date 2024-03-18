package com.xie.loop;

public class ForDemo2 {
    public static void main(String[] args) {
        // 目標: 掌握使用for循環批量產生數據
        for (int i = 1; i <= 100; i++){
            System.out.println(i);
        }

        System.out.println("==============================");
        // 1到5的總和
        int sum = 0;
        for (int i = 1; i <= 5; i++){
            // i = 1 2 3 4 5
            sum += i;
        }
        System.out.println(sum);

        System.out.println("==============================");
        // 找出1~100間的奇數總和
        // 方法 1
        int sum2 = 0;
        for (int i = 1; i <= 100; i += 2){
            // i = 1 3 5 7 ...
            sum2 += i;
        }
        System.out.println(sum2);

        System.out.println("==============================");
        // 方法二
        int sum3 = 0;
        // 1.定義循環產生1~100間的每個數據
        for (int i = 1; i <= 100; i++){
            // i = 1 2 3 ... 99 100
            // 2. 使用if分支判斷是否為奇數，是奇數才累加
            if(i%2 == 1){
                // i = 1 3 5 ... 97 99
                sum3 += i;
            }
        }
        System.out.println(sum3);
    }
}
