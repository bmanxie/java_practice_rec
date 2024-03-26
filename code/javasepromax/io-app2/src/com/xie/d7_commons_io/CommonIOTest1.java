package com.xie.d7_commons_io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 目標: 使用CommonsIO框架進行IO相關的操作
 */
public class CommonIOTest1 {
    public static void main(String[] args) throws Exception{
        // 拷貝文件
        FileUtils.copyFile(new File("D:/resource/下載.png"), new File("D:/resource/ccc/下載.png"));

        // 拷貝文件夾
        FileUtils.copyDirectory(new File("D:/resource/aaa"), new File("D:/resource/ccc/複製的aaa"));

        // 刪除文件夾(非空文件夾)
        FileUtils.deleteDirectory(new File("D:/resource/ccc/複製的aaa"));

        // Java提供的原生代碼也能一行搞定
        // 拷貝文件
        Files.copy(Path.of("D:/resource/下載.png"), Path.of("D:/resource/ccc/ddd/下載.png"));
        // 讀取文字
        System.out.println(Files.readString(Path.of("io-app2\\src\\ittest2.txt")));
    }
}
