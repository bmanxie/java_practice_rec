package com.xie;

import java.util.Scanner;

import static java.util.Collections.reverse;

public class Test4 {
    public static void main(String[] args) {
        // 目標: 4位數字加密
        int code = code();
        if (code < 10000 && code >= 0){
            System.out.println("加密後結果是:" + encrypt(code));
        }else {
            System.out.println("格式錯誤");
        }
    }

    public static int code(){
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入密碼:");
        int n = sc.nextInt();
        return n;
    }
    public static String encrypt(int number){
        // number = 1982
        // 1. 將密碼拆分成一個一個數字，才可以進行加密
        int[] numbers = split(number);
        // numbers = [1,9,8,2]

        // 2. 遍歷數組中的每個數字，進行加密
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (numbers[i] + 5) % 10;
        }

        // 3. 反轉數組
        reverse(numbers);

        // 4. 將加密的數字拼接起來返回
        String data = "";
        for (int i = 0; i < numbers.length; i++){
            data += numbers[i];
        }
        return data;
    }

    public static int[] split(int number){
        // 1982
        int[] numbers = new int[4];
        numbers[0] = number / 1000;
        numbers[1] = (number / 100) % 10;
        numbers[2] = (number / 10 ) % 10;
        numbers[3] = number % 10;
        return numbers;
    }

    public static void reverse(int[] numbers){
        // 反轉數組
        for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
            // 交換i和j
            int temp = numbers[j];
            numbers[j] = numbers[i];
            numbers[i] = temp;
        }
    }
}
