package com.xie.d1_properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class PropertiesTest3 {
    public static void main(String[] args) throws Exception{
        // 目標: 讀取屬性文件，判斷是否存在楊過，存在年齡改成25
        // 1. 加載屬性文件的鍵值對到程序中
        Properties properties = new Properties();

        // 2. 開始加載
        properties.load(new FileReader("properties-xml-log-app/src/users.txt"));

        // 3. 判斷是否包含楊過這個鍵
        if(properties.containsKey("楊過")){
            properties.setProperty("楊過", "25");
        }

        // 4. 把properties對象的鍵值對數據重新寫出去到屬性文件中
        properties.store(new FileWriter("properties-xml-log-app/src/users.txt")
                , "success!");
    }
}
