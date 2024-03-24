package com.xie.d4_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionTest1 {
    public static void main(String[] args) throws ParseException{
//        // 運行時異常，程式運作的時候才會出錯
//        Integer a =Integer.valueOf("a");
//
//        int[] arr = {11,22,33};
//        System.out.println(arr[5]);

        // 編譯時異常，編譯階段就會提醒
        // 解決方式1. 用try.. catch
        // try{
        //     可能異常的代碼
        // }catch(異常類型 變量){
        //      處理異常
        // }
        //
        // 解決方式2. 在方法開頭throws
//        try { // 試圖監視
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse("2024-02-24 11:22");
            System.out.println(d);
//        } catch (ParseException e){
//            e.printStackTrace();
//        }


    }
}
