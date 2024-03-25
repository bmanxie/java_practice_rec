package com.xie.d1_fie;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * 目標: 掌握File提供的判斷文件類型，獲取文件訊息功能
 */
public class FileTest2 {
    public static void main(String[] args) {
        // 1. 創建文件對象，指代某個文件
        File f1 = new File("D:/resource/ab.txt");

        // 2. public boolean exists(): 判斷當前文件對象，對應的文件路徑是否存在，存在返回true
        System.out.println(f1.exists());

        // 3. public boolean isFile(): 判斷當前文件對象指代的是否是文件，是文件返回true
        System.out.println(f1.isFile());

        // 4. public boolean isDirectory(): 判斷當前文件對象指代的是否是文件夾，是文件夾返回true
        System.out.println(f1.isDirectory());

        // 5. public String getName(): 獲取文件名稱(包含文檔類型)
        System.out.println(f1.getName());

        // 6. public long length(): 獲取文件的大小，返回字節個數
        System.out.println(f1.length());

        // 7. public long lastModified(): 獲取文件最後修改時間
        long time = f1.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        System.out.println(sdf.format(time));

        // 8. public String getPath(): 獲取創建文件對象時，使用的路徑
        File f2 = new File("D:/resource/ab.txt");
        File f3 = new File("file-io-app\\src\\exampl.txt");
        System.out.println(f2.getPath());
        System.out.println(f3.getPath());

        // 9. public String getAbsolutePath(): 獲取絕對路徑
        System.out.println(f2.getAbsolutePath());
        System.out.println(f3.getAbsolutePath());
    }
}
