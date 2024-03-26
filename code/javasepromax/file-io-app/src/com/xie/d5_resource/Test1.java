package com.xie.d5_resource;

/**
 * 目標: 認識try-catch-finally
 */
public class Test1 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
            return;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("====finally執行了====");
        }
        System.out.println(chu(10, 5));
    }


    public static int chu(int a, int b){
        try {
            return a/b;
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }finally {
            // 不要在finally裡面返回數據，會使返回結果不準確
            return 111;
        }
    }
}
