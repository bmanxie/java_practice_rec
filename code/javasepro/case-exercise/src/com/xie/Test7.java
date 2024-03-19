package com.xie;

public class Test7 {
    public static void main(String[] args) {
        // 目標: 找質數
        // 任務: 101 - 200間有多少質數
        System.out.println("質數個數:" + search(1, 100));
    }

    public static int search(int start, int end){
        // start = 101, end = 200
        int count = 0;
        // 找到 101 - 200的每個數據
        for (int i = start; i <= end; i++){
            if(i == 1){
                continue;
            }
            // 先假設是質數
            boolean flag = true;

            // 判斷當前i的數值是不是質數
            for (int j = 2; j <= i/2; j++){
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
}
