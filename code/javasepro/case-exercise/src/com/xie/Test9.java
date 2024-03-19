package com.xie;

/*
   *
  ***
 *****
*******

 電腦只能一列一列印
 先找規律，再寫代碼
 列(i)     先打空格(n-i)  再放星星(2i-1)   換列
 1            3              1
 2            2              3
 3            1              5
 4            0              7
 */
public class Test9 {
    public static void main(String[] args) {
        // 目標: 輸出三角形
        // 1. 定義幾列
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // 2. 印多少空格
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            
            // 3. 印多少*
            for (int j = 1; j <= (2*i - 1) ; j++) {
                System.out.print("*");
                 //System.out.print(j % 2 == 0 ? " " : "*");
            }

            // 4. 下一排
            System.out.println();
        }


    }
}
