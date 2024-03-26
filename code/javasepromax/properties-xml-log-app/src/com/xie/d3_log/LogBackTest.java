package com.xie.d3_log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 目標: 掌握logBack日誌框架的使用
 */
public class LogBackTest {
    // 創建一個Logger日誌對象
    public static final Logger LOGGER = LoggerFactory.getLogger("LogBackTest");
    public static void main(String[] args) {

        try{
            LOGGER.info("除法方法開始執行");
            chu(10,5);
            LOGGER.info("執行成功");
        }catch (Exception e){
            LOGGER.error("執行失敗出現bug");
        }
    }

    public static void chu(int a, int b){
        LOGGER.debug("參數a: " + a);
        LOGGER.debug("參數b: " + b);
        int c = a / b;
        LOGGER.info("結果是:" + c);
    }
}
