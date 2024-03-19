package com.xie.define;

public class MethodProblem3 {
    public static int sum(int a, int b){
        int c = a + b;
        return c;
        // System.out.println("hello world"); // 會出錯
    }

    public static void Hello(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        // 目標: 學習方法的常見問題
        // 1. 方法在類的位置，前後無所謂，但是方法不能定義在另一個方法理面
        // 2. 方法的返回值類型void，方法內不能使用return返回數據。如果寫了具體類型，必須使用return返回對應類型數據
        // 3. return下面不能編寫代碼，屬於無效代碼，執行不到
        // 4. 方法不調用就不會執行，調用方法時，傳給方法的數據，必須匹配方法的參數情況
        // 5. 調用有返回值的方法有3種: 1. 可以定義接收結果 2. 直接輸出調用 3. 直接調用
        // 第1種
        int rs = sum(90, 10);

        //第2種
        System.out.println(rs);
        System.out.println(sum(5, 6));

        // 第3種
        sum(100,200);

        // 6. 調用無返回值的方法: 只能直接調用
        Hello();
    }
}
