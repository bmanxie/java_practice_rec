package com.xie.d4_byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 目標: 掌握FileInputStream每次讀取多個字符
 */
public class FileInputStreamTest2 {
    public static void main(String[] args) throws Exception {
        // 1. 創建一個字節輸入流對象代表字節輸入流管道與源文件接通
        InputStream is = new FileInputStream("file-io-app\\src\\ittest2.txt");

        // 2. 開始讀取文件中的字節數據，讀取多個字節
        // public int read(byte b[]) throws IOException
        // 每次讀取多個字節到字節數組中去，返回讀取的字節數量，讀取完畢(沒有字節了)會返回-1
//        byte[] buffer = new byte[3];
//        int len = is.read(buffer);
//        String rs = new String(buffer);
//        System.out.println(rs);
//        System.out.println("每次讀取的字節數量: " + len);
//
//        // buffer = [abc]
//        // buffer = [66c]
//        int len2 = is.read(buffer);
//        // 讀取多少倒出多少
//        String rs2 = new String(buffer, 0 ,len2);
//        System.out.println(rs2);
//        System.out.println("每次讀取的字節數量: " + len2);
//
//        int len3 = is.read(buffer);
//        System.out.println(len3); // -1

        // 3. 使用循環改造
        byte[] buffer = new byte[3];
        int len; // 記住每次讀了多少字節
        while ((len = is.read(buffer)) != -1){
            // 注意: 讀取多少，倒出多少
            String rs = new String(buffer, 0, len);
            System.out.println(rs);
        }
        // 性能得到提升
        // 這種方案也不能避免讀取漢字輸出亂碼的問題

        is.close();
    }
}
