package com.xie.d2_recursion;

/**
 * 目標: 掌握遞歸的計算，執行流程和算法思想
 *      計算n的階層
 *      遞歸篹法三要素:
 *      1. 遞歸的公式: f(n) = f(n-1)*n
 *      2. 終結點: f(1)
 *      3. 遞歸的方向必須走向終結點
 */
public class RecursionTest2 {
    public static void main(String[] args) {
        System.out.println("5! = " + f(5));
    }

    public static int f(int n){
        // 終結點
        if(n == 1){
            return 1;
        }else {
            return f(n-1) *n;
        }
    }
}
