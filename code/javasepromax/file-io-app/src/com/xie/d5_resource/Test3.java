package com.xie.d5_resource;

import java.io.*;

public class Test3 {
    public static void main(String[] args) {
        try (
                // 1. 創建一個字節輸入流管道與源文件接通
                InputStream is = new FileInputStream("D:/resource/下載.png");
                // 2. 創建一個字節輸出流管道與目標文件接通
                OutputStream os = new FileOutputStream("D:/resource/bbb/下載.png");

                // 只能放置資源對象。(流對象)
                // 什麼是資源? 資源都是會實現AutoCloseable接口。
                // 資源都會有一個close方法，並且放到這裡後，用完之後，會被自動調用其close方法完成資源的釋放操作
                MyConnection conn = new MyConnection();
                ){
            System.out.println(10/0); // 故意做異常

            // 3. 創建一個字節數組，負責轉移字節數據
            byte[] buffer = new byte[1024]; // 1KB
            // 4. 從字節輸入流中讀取字節數據，寫出去到字節輸出流中。讀多少寫出多少
            int len; // 記住每次讀取了多少字節
            while ((len = is.read(buffer)) != -1){
                os.write(buffer, 0, len);
            }
            System.out.println(conn);
            System.out.println("複製完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
