package com.xie.d1_fie;

import java.io.File;

/**
 * 目標: 掌握File創建對象，代表具體文件的方案。
 */
public class FileTest1 {
    public static void main(String[] args) {
        // 1. 創建一個對象， 指代表某個具體的文件
        // 路徑分隔符
        // File f1 = new File("D:/resource/ab.txt");
        // File f1 = new File("D:\\resource\\ab.txt");
        File f1 = new File( "D:" + File.separator + "resource" + File.separator + "ab.txt");
        System.out.println(f1.length()); // 文件大小

        File f2 = new File("D:/resource");
        System.out.println(f2.length());

        // 注意: File對象可以指代一個不存在的文件路徑
        File f3 = new File("D/resource/aaaaa.txt");
        System.out.println(f3.length());
        System.out.println(f3.exists()); // 文件存不存在

        // 現在要定位的文件是在模塊中，該如何定位?
        // 絕對路徑: 帶槽符
        File f4 = new File("D:\\code\\javasepromax\\file-io-app\\src\\exampl.txt");
        // 相對路徑
        //File f4 = new File("file-io-app/src/exampl.txt");
        System.out.println(f4.getAbsolutePath());
        System.out.println(f4.length());
    }
}
