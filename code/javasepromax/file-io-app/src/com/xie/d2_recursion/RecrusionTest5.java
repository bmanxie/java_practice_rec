package com.xie.d2_recursion;

public class RecrusionTest5 {
    public static int totalNumber; // 總瓶數
    public static int lastBottleNumber;
    public static int lastCoverNumber;


    public static void main(String[] args) {
        // 啤酒問題: 啤酒2元一瓶，4個蓋子可以換一瓶，兩個空瓶可以換一瓶，10元可以喝幾瓶?
        buy(10);
        System.out.println("總數: " + totalNumber);
        System.out.println("剩瓶數: " + lastBottleNumber);
        System.out.println("剩瓶蓋數: " + lastCoverNumber);
    }

    public static void buy(int money){
        // 1. 先買了再說
        int buyNumber = money / 2;
        totalNumber += buyNumber;

        // 2. 把蓋子和瓶子換算成錢繼續買
        // 計算本輪總共的蓋子、瓶子數
        int allBottleNumber = buyNumber + lastBottleNumber;
        int allCoverNumber = buyNumber + lastCoverNumber;

        int allmoney = 0;

        if(allBottleNumber >= 2){
            allmoney += (allBottleNumber / 2) * 2;
        }
        lastBottleNumber = allBottleNumber % 2;

        if(allCoverNumber >= 4){
            allmoney += (allCoverNumber / 4) * 2;
        }
        lastCoverNumber = allCoverNumber % 4;

        if(allmoney >= 2){
            buy(allmoney);
        }
    }
}
