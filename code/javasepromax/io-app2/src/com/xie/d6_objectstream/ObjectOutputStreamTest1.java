package com.xie.d6_objectstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 目標: 掌握對象字節輸出流的使用: 序列化對象
 */
public class ObjectOutputStreamTest1 {
    public static void main(String[] args) {


        try (
                // 2. 創建一個對象字節輸出流包裝原始的字節輸出流
                ObjectOutputStream oos =
                        new ObjectOutputStream(new FileOutputStream("io-app2/src/ittest10.txt"));
                ){
            // 1. 創建一個Java對象
            User u = new User("admin","張三", 32,"2222www22rrr");

            // 3. 序列化對象到文件中
            oos.writeObject(u);
            System.out.println("序列化對象成功");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
