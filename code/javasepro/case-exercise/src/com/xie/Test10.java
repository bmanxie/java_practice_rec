package com.xie;

import java.util.Random;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        // 樂透系統開發
        int[] userNumbers = userSelectNumbers();
        System.out.println("投注的號碼:");
        printArray(userNumbers);

        int[] luckyNumbers = createLuckyNumbers();
        System.out.println("中獎號碼:");
        printArray(luckyNumbers);

        judge(userNumbers, luckyNumbers);
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }

    // 設計一個用戶投注方法(前6個是紅球號碼，最後一個是藍球號碼)
    public static int[] userSelectNumbers(){
        int[] numbers = new int[7];
        // numbers = [0, 0, 0, 0, 0, 0, 0]
        //            0  1  2  3  4  5  6

        Scanner sc = new Scanner(System.in);

        // 前6個位置
        for (int i = 0; i < numbers.length - 1; i++){
            // i = 0 1 2 3 4 5
            while (true){
                // 讓用戶在當前位置投注一個紅球號碼(1-33，不能重複)
                System.out.println("輸入第" + (i+1) + "個紅球號碼(1-33之間，不能重複)");
                int number = sc.nextInt();

                // 先判斷是否在1-33之間
                if (number < 1 || number > 33){
                    System.out.println("您輸入的號碼不在範圍內，請確認");
                }else {
                    // 號碼在1-33之間，還要確認是否重複，不重複才能使用
                    if(exist(numbers, number)){
                        // 當前的號碼重複了
                        System.out.println("您輸入的號碼重複了，請確認");
                    }else {
                        // 號碼沒有重複
                        numbers[i] = number;
                        break; // 結束這次which死循環
                    }
                }
            }
        }

        // 投注藍球號碼
        while (true) {
            System.out.println("輸入藍球號碼");
            int number = sc.nextInt();
            if (number < 1 || number > 16){
                System.out.println("您的號碼不在1-16之間");
            }else{
                numbers[6] = number;
                break;
            }
        }
        return numbers;
    }

    public static boolean exist(int[] numbers, int number){
        // 判斷number是否在numbers中存在
        for (int i = 0; i < numbers.length; i++) {
            // i = 0 1 2 3 4 5
            if(numbers[i] == number){
                return true;
            }
        }
        return false;
    }

    // 隨機中獎號碼
    public static int[] createLuckyNumbers(){
        int[] numbers = new int[7];

        Random r = new Random();
        // 遍歷6個位置，依次將紅球號碼1-33放入
        for (int i = 0; i < numbers.length - 1; i++) {
            // i = 0 1 2 3 4 5

            while (true) {
                int number = r.nextInt(33) + 1; // 1-33
                // 判斷紅球是否重複
                if(!exist(numbers, number)){
                    // number不重複
                    numbers[i] = number;
                    break; // 不重複，跳出死循環
                }
            }
        }

        // 輸入藍球號碼
        numbers[6] = r.nextInt(16) + 1; // 1-16
        return numbers;
    }

    // 設計一個方法，用於判斷中獎情況
    public static void judge(int[] userNumbers, int[] luckNumbers){
        // userNumbers = [12, 14, 16, 18, 23, 26, 8]
        // luckNumbers = [16, 17, 18, 19, 26, 32, 8]

        // 1. 分別定義紅球命中多少、藍球命中多少
        int redCount = 0;
        int blueCount = 0;

        // 2. 先判斷用戶紅球命中多少
        for (int i = 0; i < userNumbers.length - 1; i++){
            for(int j = 0; j < luckNumbers.length - 1; j++){
                if(userNumbers[i] == luckNumbers[j]){
                    redCount ++;
                    break;
                }
            }
        }

        // 3. 判斷籃球命中多少
        blueCount = userNumbers[6] == luckNumbers[6] ? 1 : 0;

        System.out.println("紅球的命中數量:" + redCount);
        System.out.println("藍球的命中數量:" + blueCount);

        // 4. 判斷中獎詳情，並輸出結果
        if (redCount == 6 && blueCount == 1){
            System.out.println("恭喜中獎1千萬!!");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜中獎5百萬!!");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜中獎3000元!!");
        } else if (redCount == 5 && blueCount == 0 || redCount == 4 && blueCount == 1) {
            System.out.println("恭喜中獎200元!!");
        } else if (redCount == 4 && blueCount == 0 || redCount == 3 && blueCount == 1) {
            System.out.println("恭喜中獎100元!!");
        } else if (redCount < 3 && blueCount == 1) {
            System.out.println("恭喜中獎50元!!");
        } else{
            System.out.println("沒有中獎");
        }
    }
}
