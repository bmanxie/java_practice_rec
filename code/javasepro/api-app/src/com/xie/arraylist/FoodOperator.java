package com.xie.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    private ArrayList<Food> foodList = new ArrayList<>();
    // foodList = []

    // 2. 開發功能，上架餐點功能
    public void addFood(){
        // 3. 創建一個餐點物件，封裝餐點訊息
        Food f = new Food();

        // 4. 輸入餐點訊息
        Scanner sc = new Scanner(System.in);

        System.out.println("輸入餐點名稱:");
        String name = sc.next();
        f.setName(name);

        System.out.println("輸入售價:");
        double price = sc.nextDouble();
        f.setPrice(price);

        System.out.println("輸入描述");
        String desc = sc.next();
        f.setDesc(desc);

        // 5. 將餐點對象丟入集合中
        foodList.add(f);
        System.out.println("上架成功");
    }

    // 6. 展示餐點
    public void showAllFoods(){
        if (foodList.size() == 0){
            System.out.println("沒有餐點在架上");
            return;
        }
        for (int i = 0; i < foodList.size(); i++){
            Food f = foodList.get(i);
            System.out.println(f.getName());
            System.out.println(f.getPrice());
            System.out.println(f.getDesc());
            System.out.println("--------------");
        }
    }

    // 展示操作介面
    public void start(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("選擇功能");
            System.out.println("1. 上架餐點");
            System.out.println("2. 展示餐點");
            System.out.println("3. 退出");

            System.out.println("請選擇操作");
            String command = sc.next();
            switch (command){
                case "1":
                    addFood();
                    break;
                case "2":
                    showAllFoods();
                    break;
                case "3":
                    System.out.println("已退出系統");
                    return; // 幹掉方法
                default:
                    System.out.println("輸入命令不存在");
            }
        }

    }
}
