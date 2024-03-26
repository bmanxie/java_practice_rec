package com.xie.d2_buffered_stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/**
 * 目標: 掌握字符緩衝輸入流的用法
 */
public class BufferReaderTest2 {
    public static void main(String[] args) {
        try (
                Reader fr = new FileReader("io-app2\\src\\ittest4.txt");
                // 創建一個字符緩衝輸入流包裝原始的字符輸入流
                BufferedReader br = new BufferedReader(fr);
        ){
//            char[] buffer = new char[3];
//            int len;
//            while ((len = br.read(buffer)) != -1){
//                System.out.print(new String(buffer, 0, len));
//            }

//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());

            String line; // 記住每次讀取的一行數據
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
