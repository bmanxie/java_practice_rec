package com.xie.d1_fie;

import java.io.File;
import java.io.IOException;

/**
 * 目標: 掌握File創建和刪除文件相關的方法
 */
public class FileTest3 {
    public static void main(String[] args) throws Exception {
        // 1. public boolean createNewFile(): 創建一個新文件(文件內容為空)，創建成功返回true
        File f1 = new File("D:/resource/aaa.txt");
        System.out.println(f1.createNewFile());

        // 2. public boolean mkdir(): 用於創建文件夾，注意:只能創建一級文件夾
        File f2 = new File("D:/resource/bbb");
        System.out.println(f2.mkdir());

        // 3. public boolean mkdirs(): 用於創建文件夾，注意: 可創建多個文件夾
        File f3 = new File("D:/resource/ccc/ddd/eee");
        System.out.println(f3.mkdirs());

        // 4. public boolean delete(): 刪除文件，或者空文件夾。 不能山除非空文件夾
        System.out.println(f1.delete());
    }
}
