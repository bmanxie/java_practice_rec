package com.xie.d6_math;

public class MathTest {
    public static void main(String[] args) {
        // 目標: 了解Math類下的常見方法
        // 1. public static int abs(int a) : 取絕對值
        //    public static double abs(double a)
        System.out.println(Math.abs(-11)); // 11
        System.out.println(Math.abs(-22.3)); // 22.3

        // 2. public static double ceil(double a): 無條件進位
        System.out.println(Math.ceil(3.001)); // 4.0
        System.out.println(Math.ceil(3.0)); // 3.0

        // 3. public static double floor(doule a): 無條件捨去
        System.out.println(Math.floor(4.555)); // 4.0
        System.out.println(Math.floor(4.0)); // 4.0

        // 4. public static long round(double a): 四捨五入
        System.out.println(Math.round(3.6)); // 4.0
        System.out.println(Math.round(3.4)); // 3.0

        // 5. public static int max(int a, int b): 取較大值
        //    public static int min(int a, int b): 取較小值
        System.out.println(Math.max(20, 10)); // 20
        System.out.println(Math.min(20, 10)); // 10

        // 6. public static double pow(double a, double b): 次方
        System.out.println(Math.pow(2, 3)); // 2^3 8
        System.out.println(Math.pow(3, 2)); // 3^2 9

        // 7. public static double random(): 取隨機[ 0.0, 1.0) (包前不包後)
        System.out.println(Math.random());

    }
}
