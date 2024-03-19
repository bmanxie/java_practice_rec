package com.xie;

public class Test1 {
    public static void main(String[] args) {
        // 目標: 買飛機票案例
        double price = calculate(1000, 5, "經濟艙");
        System.out.println("價格是:" + price);
    }

    public static double calculate(double price, int month, String type){
        // 1.判斷淡旺季
        if (month >= 5 && month <= 10){
            //旺季
            // 2. 艙等
            switch (type){
                case "頭等艙":
                    price *= 0.95;
                    break;
                case "商務艙":
                    price *= 0.9;
                    break;
                case "經濟艙":
                    price *= 0.85;
                    break;
            }
        }else {
            // 淡季
            switch (type){
                case "頭等艙":
                    price *= 0.75;
                    break;
                case "商務艙":
                    price *= 0.7;
                    break;
                case "經濟艙":
                    price *= 0.65;
                    break;
            }
        }
        return price;
    }
}
