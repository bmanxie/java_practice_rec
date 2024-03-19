package com.xie.define;

public class MethodDemo2 {
    public static void main(String[] args) {
        // 目標: 掌握按照方法的實務需求不同，設計合理的方法形式解決問題
        // 不需要返回數據，返回值類型使用void
        // 需求: 輸出3行Hello World
        printHelloWorld();
        System.out.println("=======");
        printHelloWorld();
        System.out.println("=======");
        printHelloWorld2(5);
        System.out.println("=======");
    }

    /**
        無參數 無返回值的方法
     */
    public static void printHelloWorld(){
        for(int i = 1; i <= 3; i++){
            System.out.println("Hello World");
        }
    }

    /**
       有參數 無返回值
     */
    public static void printHelloWorld2(int n){
        for(int i = 1; i <= n; i++){
            System.out.println("Hello World");
        }
    }
}
