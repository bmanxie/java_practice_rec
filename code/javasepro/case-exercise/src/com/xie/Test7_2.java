package com.xie;

public class Test7_2 {
    public static void main(String[] args) {
        // 目標: 找質數
        // 任務: 101 - 200間有多少質數
        System.out.println("質數個數:" + search(101, 200));
    }

    public static int search(int start, int end){
        // start = 101, end = 200
        int count = 0;

        OUT: // 為外部循環指定標籤
        // 找到 101 - 200的每個數據
        for (int i = start; i <= end; i++){
            if(i == 1) {continue;}

            // 判斷當前i的數值是不是質數
            for (int j = 2; j <= i/2; j++){
                if(i%j == 0){
                    // 這個數不會是質數，不能輸出
                    continue OUT; // 結束外部循環的當次執行
                }
            }
                System.out.println(i);
                count++;
        }
        return count;
    }
}
