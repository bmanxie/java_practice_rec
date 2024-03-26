package com.xie.d4_byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 目標: 使用字節輸入流一次讀取文件的全部字節
 */
public class FileInputStreamTest3 {
    public static void main(String[] args) throws Exception {
        // 1. 一次性讀取完文件的全部字節到一個字節中
        // 創建一個字節輸入流管道與源文件接通
        InputStream is = new FileInputStream("file-io-app\\src\\ittest3.txt");

        // 2. 準備一個字節數組，大小與文件的大小正好一樣大
//        File f  = new File("file-io-app\\src\\ittest3");
//        long size = f.length();
//        byte[] buffer = new byte[(int) size];
//
//        int len = is.read(buffer);
//        System.out.println(new String(buffer));
//
//        System.out.println(size);
//        System.out.println(len);

        byte[] buffer = is.readAllBytes();
        System.out.println(new String(buffer));
    }
}
