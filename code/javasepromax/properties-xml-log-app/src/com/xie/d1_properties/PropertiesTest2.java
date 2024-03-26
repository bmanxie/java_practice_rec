package com.xie.d1_properties;

import java.io.FileWriter;
import java.util.Properties;

/**
 * 目標: 把鍵值對數據存入到屬性文件中
 */
public class PropertiesTest2 {
    public static void main(String[] args) throws Exception{
        // 1. 創建Properties對象出來，先用它儲存一些鍵值對數據
        Properties properties = new Properties();
        properties.setProperty("楊過", "西狂");
        properties.setProperty("周伯通", "老頑童");
        properties.setProperty("郭靖", "北俠");

        // 2. 把properties對象中的鍵值對數據存入到屬性文件中去
        properties.store(new FileWriter("properties-xml-log-app/src/user2.properties")
                , "i save many users!");
    }
}
