package com.xie.d4_byte_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 目標: 掌握文件字節輸出流FileOutputStream的使用
 */
public class FileOutputStreamTest4  {
    public static void main(String[] args) throws Exception {
        // 1. 創建一個字節輸出流與目標文件接通
        // 覆蓋管道: 覆蓋之前的數據
//        OutputStream os = new FileOutputStream("file-io-app\\src\\ittest4.txt");


        // 追加數據的管道
        OutputStream os = new FileOutputStream("file-io-app\\src\\ittest4.txt",true);
        // 2. 開始寫字節數據出去
        os.write(97); // 97就是a
        os.write('b'); // 'b' 也是一個字節
        // os.write('我'); // 默認出去只能一個字節

        byte[] bytes = "我就讀心理psy".getBytes();
        os.write(bytes);

        os.write(bytes, 0, 15);

        // 換行符
        os.write("\r\n".getBytes());

        os.close(); // 關閉流
    }

}
