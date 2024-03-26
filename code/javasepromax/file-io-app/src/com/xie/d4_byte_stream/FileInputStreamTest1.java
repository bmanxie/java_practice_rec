package com.xie.d4_byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 目標: 掌握文件字節輸入流，每次讀取一個字節
 */
public class FileInputStreamTest1 {
    public static void main(String[] args) throws Exception {
       // 1. 創建文件字節輸入流管道，與源文件連結
        // FileInputStream is = new FileInputStream(new File("file-io-app\src\ittest.txt"));
        InputStream is = new FileInputStream("file-io-app\\src\\ittest.txt");

        // 2. 讀取文件的字節數據
        // public int read(): 每次讀取一個字節返回，如果沒有數據了，返回-1
//        int b1 = is.read();
//        System.out.println((char) b1);
//
//        int b2 = is.read();
//        System.out.println((char) b2);
//
//        int b3 = is.read();
//        System.out.println((char) b3);

        // 3. 使用循環改造上述代碼
        int b; // 記住存取的字節
        while ((b = is.read()) != -1){
            System.out.print((char) b);
        }

        // 讀取數據的性能差
        // 讀取漢字輸出會亂碼，無法避免
        // 流使用完畢之後，必須關閉!釋放系統資源
        is.close();


    }
}
