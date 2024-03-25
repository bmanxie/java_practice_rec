package com.xie.d2_recursion;

public class RecursionTest3 {
    public static void main(String[] args) {
        // 猴子吃桃
        // f(10) = 1
        //  f(x)   -   f(x) / 2   -    1   = f(x+1)
        // 桃子總數 吃  一半的桃子  多吃   1   第二天的桃子數
        //  f(x) = 2f(x+1) + 2
        // f(1) = ?
        System.out.println(f(1));
    }

    public static int f(int x){
        if(x==10){
            return 1;
        }else{
            return 2*f(x+1) + 2;
        }
    }
}
