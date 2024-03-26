package com.xie.d5_data_stream;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * 目標: 掌握數據輸入流讀取特定類型的數據
 */
public class DataInputStreamTest2 {
    public static void main(String[] args) {
        try(
                DataInputStream dis =
                        new DataInputStream(new FileInputStream("io-app2/src/ittest9.txt"));
                ){
            int i = dis.readInt();
            System.out.println(i);

            double d = dis.readDouble();
            System.out.println(d);

            boolean b = dis.readBoolean();
            System.out.println(b);

            String rs = dis.readUTF();
            System.out.println(rs);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
