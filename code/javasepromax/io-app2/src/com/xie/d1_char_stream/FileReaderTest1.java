package com.xie.d1_char_stream;

import java.io.FileReader;
import java.io.Reader;

/**
 * 目標: 掌握文件字符號輸入流每次讀取一個字符
 */
public class FileReaderTest1 {
    public static void main(String[] args) {
        try (
                // 1. 創建一個文件字符輸入流管道與源文件接通
                Reader fr = new FileReader("io-app2\\src\\ittest.txt");
                ){
            // 2. 讀取文本文件的內容
//            int c; // 記住每次讀取的字符編號
//            while ((c = fr.read()) != -1){
//                System.out.print((char) c);
//            }
            // 每次讀取一個字符的形式，性能差

            // 3. 每次讀取多個字符
            // 性能比較不錯
            char[] buffer = new char[3];
            int len; // 每次讀取多少字符
            while ((len = fr.read(buffer)) != -1){
                // 讀取多少倒多少
                System.out.print(new String(buffer, 0, len));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
