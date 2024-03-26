package com.xie.d1_properties;

import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

/**
 * 目標: 掌握Properties類讀取屬性文件中的鍵值對訊息
 */
public class PropertiesTest1 {
    public static void main(String[] args) throws Exception{
        // 1. 創建一個Properties的對象出來(鍵值對集合，空容器
        Properties properties = new Properties();
        System.out.println(properties);

        // 2. 開始加載屬性文件中的鍵值對數據到properties對象中
        properties.load(new FileReader("properties-xml-log-app\\src\\users.properties"));
        System.out.println(properties);

        // 3. 根據鍵取值
        System.out.println(properties.getProperty("張無忌"));
        System.out.println(properties.getProperty("趙敏"));

        // 4. 遍歷全部鍵和值
        Set<String> keys = properties.stringPropertyNames();
        for(String key: keys){
            String value = properties.getProperty(key);
            System.out.println(key + " =====> " + value);
        }

        properties.forEach((k, v) -> {
            System.out.println(k + "---->" + v);
        });
    }

}
