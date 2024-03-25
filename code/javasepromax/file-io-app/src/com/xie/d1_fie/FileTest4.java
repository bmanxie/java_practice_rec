package com.xie.d1_fie;

import java.io.File;

/**
 * 目標: 掌握File提供的遍歷文件夾的方法
 */
public class FileTest4 {
    public static void main(String[] args) {
        // 1. public String[] list(): 獲取當前目錄下所有的"一級文件名稱"到一個字符串數組中去返回
        File f1 = new File("D:\\resource");
        String[] names = f1.list();
        for(String name: names){
            System.out.println(name);
        }

        // 2. public File[] listFiles():(重點)獲取當前目錄下所有的"一級文件對象"到一個文件對象數組中去返回(重點)
        File[] files = f1.listFiles();
        for(File file: files){
            System.out.println(file.getAbsolutePath());
        }
    }
}
