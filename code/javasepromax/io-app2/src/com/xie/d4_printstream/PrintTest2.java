package com.xie.d4_printstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 目標: 掌握輸出語句的重定向
 */
public class PrintTest2 {
    public static void main(String[] args) {
        System.out.println("老驥伏櫪");
        System.out.println("志在千里");

        try (PrintStream ps = new PrintStream("io-app2/src/ittest8.txt");){
            System.setOut(ps);
            // 透過這個設置，可以將System.out.println不是輸出到控制台，而是自己設置的打印流位置
            System.out.println("壯士暮年");
            System.out.println("狀心不已");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
