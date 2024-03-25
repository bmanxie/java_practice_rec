package com.xie.d1_fie;

import java.io.File;

public class FileTest5 {
    public static void main(String[] args) {
        // 目標: 改變某個文件夾的序號，要求從5開始排
        File dir = new File("D:/resource/aaa");

        // 1. 拿到下面全部文件名稱，一級文件對象
        File[] files = dir.listFiles();

        // 2. 一個一個找
        for (File file: files){
            // 3. 拿到名稱
            String name = file.getName(); // name = "1、student"
            String index = name.substring(0, name.indexOf("、")); // 截出頓號以前的數字
            String lastName = name.substring(name.indexOf("、")); // 截出自頓號開始的文字
            String newName = (Integer.valueOf(index) + 4) + lastName; // 數字先+4(從5開始排)再跟原本的文字結合

            // 4. 正式改名
            file.renameTo(new File(file.getParent(), newName));
        }

    }

}

