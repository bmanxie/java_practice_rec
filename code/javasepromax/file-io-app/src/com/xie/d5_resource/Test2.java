package com.xie.d5_resource;

import java.io.*;

/**
 * 目標: 掌握釋放資源的方式
 */
public class Test2 {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try {
            // 1. 創建一個字節輸入流管道與源文件接通
            is = new FileInputStream("D:/resource/下載.png");
            // 2. 創建一個字節輸出流管道與目標文件接通
            os = new FileOutputStream("D:/resource/bbb/下載.png");

            System.out.println(10/0); // 故意做異常

            // 3. 創建一個字節數組，負責轉移字節數據
            byte[] buffer = new byte[1024]; // 1KB
            // 4. 從字節輸入流中讀取字節數據，寫出去到字節輸出流中。讀多少寫出多少
            int len; // 記住每次讀取了多少字節
            while ((len = is.read(buffer)) != -1){
                os.write(buffer, 0, len);
            }
            System.out.println("複製完成");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 釋放資源的操作
            try {
                if(os != null){os.close();}
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if(is != null){is.close();}
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
