package com.xie.d2_buffered_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterTest3 {
    public static void main(String[] args) {
        try (
                Writer fw = new FileWriter("io-app2/src/ittest5.txt",true);
                // 創建一個字符緩衝輸出流包裝原始的字符樹出流
                BufferedWriter bfw = new BufferedWriter(fw);
        ){
            bfw.write("春曉");
            bfw.write("出塞");
            bfw.write("江雪");
            bfw.newLine();
            bfw.write("早發白帝城");
            bfw.newLine();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
