package com.xie.loop;

public class LoopNestedDemo7 {
    public static void main(String[] args) {
        // 目標: 搞清楚巢狀循環
        // 任務: 存3天錢，每天存錢5次1元
        for (int i = 1; i <= 3; i++){
            // i = 1 2 3
            for (int j = 1; j <= 5; j++){
                // j 1 2 3 4 5
                System.out.printf("第%d天第%d次存1元", i, j);
                System.out.println();
            }
            System.out.println("====================");
        }

        //目標: 輸出下面結果:
            /*
                ****
                ****
                ****
             */
        for (int i = 1; i < 4; i++){
            for (int j = 1; j <= 4; j++){
                System.out.print("*"); // 輸出不換行的4個****
            }
                System.out.println(); // 換行
        }
    }
}
