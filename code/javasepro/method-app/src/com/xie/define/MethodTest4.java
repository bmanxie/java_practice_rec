package com.xie.define;

public class MethodTest4 {
    public static void main(String[] args) {
        // 目標: 學習設計方法的技巧
        int rs = add(5);
        System.out.println(rs);

        System.out.println("============");
        judge(10);
    }

    public static int add(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    public static void judge(int number){
        if(number%2 == 0){
            System.out.println("是偶數");
        }else {
            System.out.println("是奇數");
        }
    }
}
