package com.xie.arraylist;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        /* 任務:
         購物車中存放了這些商品:[Java入門, 日本QQ靠墊, android手機保護殼, 螺絲工具組, 透明保護殼, iphone手機保護殼]
         今天不需要買手機殼了，因此要把手機殼移除:
        */
        // 1. 創建一個ArrayList集合對象
        ArrayList<String> list = new ArrayList<>();
        list.add("Java入門");
        list.add("日本QQ靠墊");
        list.add("android手機保護殼");
        list.add("螺絲工具組");
        list.add("透明保護殼");
        list.add("iphone手機保護殼");

        System.out.println(list);

        // 2. 開始完成需求，從集合中找出包含
        /* 錯誤示範:
        for(int i = 0; i < list.size(); i++){
            // i = 0 1 2 3 4 5
            // 取出當前遍歷的數據
            String ele = list.get(i);
            // 判斷是否包含保護殼
            if(ele.contains("保護殼")){
                // 直接刪除
                list.remove(ele);
            }
        }
        System.out.println(list);
        */

        // 方法一:每次刪除一個數據，就讓i往左退一格
        /*
        for(int i = 0; i < list.size(); i++){
            // i = 0 1 2 3 4 5
            // 取出當前遍歷的數據
            String ele = list.get(i);
            // 判斷是否包含保護殼
            if(ele.contains("保護殼")){
                // 直接刪除
                list.remove(ele);
                i--;
            }
        }
        System.out.println(list);
         */

        // 方法二: 從集合後面開始遍歷並刪除
        for(int i = list.size() - 1; i >= 0; i--){
            // i = 5 4 3 2 1 0
            // 取出當前遍歷的數據
            String ele = list.get(i);
            // 判斷是否包含保護殼
            if(ele.contains("保護殼")){
                // 直接刪除
                list.remove(ele);
            }
        }
        System.out.println(list);

    }
}
