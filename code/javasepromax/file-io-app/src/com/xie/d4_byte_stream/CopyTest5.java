package com.xie.d4_byte_stream;

import java.io.*;

/**
 * 目標: 使用字節流完成對文件的複製操作
 */
public class CopyTest5 {
    public static void main(String[] args) throws Exception {
        // 需求: 複製照片
        // 1. 創建一個字節輸入流管道與源文件接通
        InputStream is = new FileInputStream("D:/resource/下載.png");
        // 2. 創建一個字節輸出流管道與目標文件接通
        OutputStream os = new FileOutputStream("D:/resource/bbb/下載.png");
        // 3. 創建一個字節數組，負責轉移字節數據
        byte[] buffer = new byte[1024]; // 1KB
        // 4. 從字節輸入流中讀取字節數據，寫出去到字節輸出流中。讀多少寫出多少
        int len; // 記住每次讀取了多少字節
        while ((len = is.read(buffer)) != -1){
            os.write(buffer, 0, len);
        }
        os.close();
        is.close();
        System.out.println("複製完成");
    }
}
