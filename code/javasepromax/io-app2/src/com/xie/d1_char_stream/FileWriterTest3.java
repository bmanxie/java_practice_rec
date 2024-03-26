package com.xie.d1_char_stream;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterTest3 {
    public static void main(String[] args) throws Exception{
        // 字符串輸出流必須包含刷新流或操作流，寫出去的數據才能生效
        Writer fw =new FileWriter("io-app2/src/ittest3.txt");

        // 寫字符數據出去
        fw.write('a');
        fw.write('b');
        fw.write('c');
        fw.write('d');
        fw.write('e');
        fw.write("\r\n");

        fw.write("大家好");
        fw.write("\r\n");
        fw.write("大家好");

//        fw.flush(); // 刷新流

        fw.close(); // 關閉流，包含刷新操作
    }
}
