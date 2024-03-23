package com.xie.d8_runtime;

import java.io.IOException;

public class RuntimeTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 1. public static Runtime getRuntime(): 返回與當前Java應用程序關聯的運行時對象
        Runtime r = Runtime.getRuntime();

        // 2. public void exit(int status): 終止當前運行的虛擬機，該參數用作狀態代碼; 依照案例，非零狀態代碼表示異常終止
        // r.exit(0);

        // 3. public int availableProcessors(): 獲取虛擬機能使用的處理器數
        System.out.println(r.availableProcessors());

        // 4. public long tatalMemory() 返回Java虛擬機中的內存總量
        System.out.println(r.totalMemory()/1024.0/1024.0 + "MB");

        // 5. public long freeMemory() 返回Java虛擬機中的可用內存量
        System.out.println(r.freeMemory()/1024.0/1024.0 + "MB");

        // 6. public Process exec(String command) 啟動某個程序，並返回代表該程序的對象
        Process chr = r.exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        Thread.sleep(5000); // 讓程序停在這5秒
    }
}
