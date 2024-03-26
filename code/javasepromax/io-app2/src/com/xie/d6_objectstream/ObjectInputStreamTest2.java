package com.xie.d6_objectstream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 目標: 掌握對象字節輸入流的使用: 反序列化對象
 */
public class ObjectInputStreamTest2 {
    public static void main(String[] args) {
        try (
                // 1. 創建一個對象字節輸入流管道，包裝低級的字節輸入流與源文件接通
                ObjectInputStream ois =
                        new ObjectInputStream(new FileInputStream("io-app2\\src\\ittest10.txt"));
                ){
            User u = (User) ois.readObject();
            System.out.println(u);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
