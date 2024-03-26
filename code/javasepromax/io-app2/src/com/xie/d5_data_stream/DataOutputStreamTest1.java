package com.xie.d5_data_stream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 目標: 數據輸出流
 */
public class DataOutputStreamTest1 {
    public static void main(String[] args) {
        try (
                // 1. 創建一個數據輸出流包裝低級的字節輸出流
                DataOutputStream dos =new DataOutputStream
                        (new FileOutputStream("io-app2/src/ittest9.txt"));
        ){
            dos.writeInt(97);
            dos.writeDouble(99.2);
            dos.writeBoolean(true);
            dos.writeUTF("台中市豐原區");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
