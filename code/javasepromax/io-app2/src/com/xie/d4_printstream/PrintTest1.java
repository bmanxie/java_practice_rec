package com.xie.d4_printstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 目標: 掌握打印流: PrintStream/PrintWriter的用法
 */
public class PrintTest1 {
    public static void main(String[] args) {

        try (
//                // 1. 創建一個打印流管道
//                PrintStream ps = new PrintStream("io-app2/src/ittest7.txt", "UTF-8");
                PrintWriter ps = new PrintWriter("io-app2/src/ittest7.txt", "UTF-8");
        ){
            ps.println('a');
            ps.println(97);
            ps.println("我在台中");
            ps.println(true);
            ps.write(97); // 'a'
            ps.println("as");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
