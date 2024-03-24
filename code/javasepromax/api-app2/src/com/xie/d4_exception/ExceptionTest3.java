package com.xie.d4_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 目標: 異常的處理
 */
public class ExceptionTest3 {
    public static void main(String[] args) {
        try {
            test1();
        } catch (ParseException e) {
            System.out.println("時間格式錯誤");
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
            e.printStackTrace();
        }
    }

    public static void test1() throws ParseException , FileNotFoundException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date d = sdf.parse("2033-05-31 22-11-22");
        test2();
    }

    public static void test2() throws FileNotFoundException {
        InputStream is = new FileInputStream("D:/hello.png");

    }
}
