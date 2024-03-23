package com.xie.d7_enum2;

public class Test {
    public static void main(String[] args) {
        // 目標: 掌握列舉應用場景
//        check(Constant.BOY);
        check(Constant2.BOY);
    }

    public static void check(Constant2 sex){
        switch(sex){
            case BOY:
                System.out.println("展示美女圖，遊戲訊息");
                break;
            case GIRL:
                System.out.println("展示帥哥圖，美妝");
                break;
        }
    }

//    public static void check(int sex){
//        switch(sex){
//            case Constant.BOY:
//                System.out.println("展示美女圖，遊戲訊息");
//                break;
//            case Constant.GIRL:
//                System.out.println("展示帥哥圖，美妝");
//                break;
//        }
//    }
}
