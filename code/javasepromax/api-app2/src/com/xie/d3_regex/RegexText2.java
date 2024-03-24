package com.xie.d3_regex;

import java.util.Scanner;

/**
 * 驗證用戶的電話、Email是否符合規定
 */
public class RegexText2 {
    public static void main(String[] args) {
        checkPhone();
        checkEmail();
    }

    public static void checkPhone(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("輸入電話:");
            String phone = sc.nextLine();

            // 0908727796 0908-727-796 0800092000 08-00092000
            if(phone.matches("(0\\d{3}-?\\d{3}-?\\d{3})|(0\\d{1}-?\\d{8})")){
                System.out.println("格式正確");
                break;
            }else{
                System.out.println("格式錯誤");
            }
        }
    }

    public static void checkEmail(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("輸入電子信箱:");
            String email = sc.nextLine();

            // 0908727796 0908-727-796 0800092000 08-00092000
            if(email.matches("\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2}")){
                System.out.println("格式正確");
                break;
            }else{
                System.out.println("格式錯誤");
            }
        }
    }
}

