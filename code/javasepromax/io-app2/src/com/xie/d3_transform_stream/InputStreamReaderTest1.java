package com.xie.d3_transform_stream;

import java.io.*;

/**
 * 目標: 掌握字符輸入轉換流的作用
 */
public class InputStreamReaderTest1 {
    public static void main(String[] args) {
        try (
                // 1. 得到文件的原始字節流(GBK的字節流形式)
                InputStream is = new FileInputStream("io-app2/src/itGBKtest6.txt");
                // 2. 將原始的字節輸入流按照指定的字符集編碼轉換成字符輸入流
                Reader isr = new InputStreamReader(is, "GBK");
                // 3. 將字符輸入流轉換成緩衝字符輸入流
                BufferedReader br = new BufferedReader(isr);
                ){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
