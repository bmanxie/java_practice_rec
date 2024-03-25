package com.xie.d2_recursion;

import java.io.File;

/**
 * 目標: 掌握文件搜索的實現
 */
public class RecursionTest4 {
    public static void main(String[] args) {
        searchFile(new File("D:/"), "MapleStory.exe");
    }

    /**
     * 去目錄搜索文件
     * @param dir 目錄
     * @param fileName 搜索文件的名稱
     */
    public static void searchFile(File dir, String fileName){
        // 1. 把非法的情況都攔截
        if(dir == null || !dir.exists() || dir.isFile()){
            return; // 代表無法搜索
        }

        // 2. dir不是null，存在，一定是目錄對象
        // 獲取當前目錄下全部一級文件對象
        File[] files = dir.listFiles();

        // 3. 判斷當前幕錄下是否存在一級文件對象，以及是否可以拿到一級文件對象
        if(files != null && files.length > 0){
            // 4. 遍歷全部一級文件
            for(File f: files){
                // 5. 判斷文件是否是文件，還是文件夾
                if(f.isFile()){
                    // 是文件，判斷這個文件名是否是目標
                    if(f.getName().contains(fileName)){
                        System.out.println("找到了: " + f.getAbsolutePath());
                    }
                }else{
                    // 是文件夾，繼續重複這個過程(遞歸)
                    searchFile(f, fileName);
                }
            }
        }
    }
}
