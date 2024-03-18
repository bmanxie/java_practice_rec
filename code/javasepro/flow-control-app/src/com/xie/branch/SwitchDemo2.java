package com.xie.branch;

public class SwitchDemo2 {
    public static void main(String[] args) {
        // 目標: 掌握switch寫法，並了解流程
        // switch能做到的if也能做，但是性能較好點
        // 星期一:猴子穿新衣。           星期五:猴子去跳舞。
        // 星期二:猴子肚子餓。           星期六:猴子去斗六。
        // 星期三:猴子去爬山。           星期日:猴子過生日。
        // 星期四:猴子去考試。

        String  week = "星期五";
        switch (week){
            case "星期一":
                System.out.println("猴子穿新衣。");
                break;
            case "星期二":
                System.out.println("猴子肚子餓。");
                break;
            case "星期三":
                System.out.println("猴子去爬山。");
                break;
            case "星期四":
                System.out.println("猴子去考試。");
                break;
            case "星期五":
                System.out.println("猴子去跳舞。");
                break;
            case "星期六":
                System.out.println("猴子去斗六。");
                break;
            case "星期日":
                System.out.println("猴子過生日。");
                break;
            default:
                System.out.println("輸入的星期有誤");
        }
    }
}
