package com.xie.d2_buffered_stream;

import java.io.*;

/**
 * 目標: 掌握字節緩衝流的作用
 */
public class BufferedInputStreamTest1 {
    public static void main(String[] args) {
        try (
                InputStream is = new FileInputStream("io-app2\\src\\ittest.txt");
                // 定義一個字節緩衝輸入流包裝原始的輸入流
                InputStream bis = new BufferedInputStream(is, 8192 * 2);

                OutputStream os = new FileOutputStream("io-app2/src/ittest_bak.txt");
                // 定義一個字節緩衝輸出流包裝原始的字節輸出流
                OutputStream bos = new BufferedOutputStream(os, 8192 * 2);
        ){
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer, 0, len);
            }
            System.out.println("複製完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
