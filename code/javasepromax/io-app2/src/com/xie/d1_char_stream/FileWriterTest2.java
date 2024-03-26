package com.xie.d1_char_stream;

import java.io.FileWriter;
import java.io.Writer;

/**
 * 目標: 掌握文件字符輸出流: 寫字符數據出去
 */
public class FileWriterTest2 {
    public static void main(String[] args) {
        try (
                // 0. 創建一個文件字符輸出流管道與目標文件接通
                // 覆蓋管道
                //Writer fw =new FileWriter("io-app2/src/ittest2.txt");
                // 追加管道
                Writer fw =new FileWriter("io-app2/src/ittest2.txt",true);
                ){
            // 1. public void write(int c): 寫一個字符出去
            fw.write('a');
            fw.write(97);
            fw.write('我');
            fw.write("\r\n");

            // 2. public void write(String c): 寫一個字符串出去
            fw.write("我在經管所aa");
            fw.write("\r\n");

            // 3. public void write(String c, int pos, int len): 寫字符串的一部份出去
            fw.write("我在經管所aa",0,5);
            fw.write("\r\n");

            // 4. public void write(char[] buffer): 寫一個字符數組出去
            char[] buffer = {'客','戶','關','係'};
            fw.write(buffer);
            fw.write("\r\n");

            // 5. public void write(char[] buffer, int pos, int len): 寫字符數組的一部份出去
            fw.write(buffer, 0, 2);
            fw.write("\r\n");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
