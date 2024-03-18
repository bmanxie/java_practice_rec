package com.xie.branch;

public class SwitchDemo3 {
    public static void main(String[] args) {
        // 目標: 了解switch使用時的注意事項
        /*
        1. 表達式只能是byte, short, int, char。JDK5開始支持枚舉, JDK7支持String, 不支持double, float, long
        2. case的值不允許重複，只能是常量，不能用變量
        3. 正常使用switch時不要忘記break，否則會繼續穿透
            穿透性有時可用來簡化代碼
        */
        // 利用穿透性
        // 星期一:猴子穿新衣。           星期五:猴子去跳舞。
        // 星期二:猴子休息。           星期六:猴子玩遊戲。
        // 星期三:猴子休息。           星期日:猴子玩遊戲。
        // 星期四:猴子休息。

        String  week = "星期二";
        switch (week){
            case "星期一":
                System.out.println("猴子穿新衣。");
                break;
            case "星期二":
            case "星期三":
            case "星期四":
                System.out.println("猴子休息。");
                break;
            case "星期五":
                System.out.println("猴子去跳舞。");
                break;
            case "星期六":
            case "星期日":
                System.out.println("猴子玩遊戲。");
                break;
            default:
                System.out.println("輸入的星期有誤");
        }
    }
}
