package com.xie.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 展示系統中的全部電影
        // 根據電影編號查詢電影資訊
        Movie[] movies = new Movie[4];
        movies[0] = new Movie(1, "沙丘", 299, 9.2, "丹尼·維勒納夫", "提摩西·夏勒梅", "美國太空史詩科幻電影");
        movies[1] = new Movie(2, "飛鴨向前衝", 0, 9.9, "班傑明·雷納", "麥克·馬拉德", "美國動畫冒險喜劇片");
        movies[2] = new Movie(3, "劇場版 SPY×FAMILY CODE: White", 229, 9.5, "片桐崇", "安妮亞·佛傑", "日本動畫電影");
        movies[3] = new Movie(4, "坂本龍一：OPUS", 299, 10, "Neo Sora", "坂本龍一", "音樂會電影");

        // 創建電影操作類對象
        MovieOperator operator = new MovieOperator(movies);
//        operator.printAllMovies();
//        operator.searchMovieById(3) ;

        // 依據用戶操作返回特定訊息
        Scanner sc = new Scanner(System.in);
        OUT:
        while (true) {
            System.out.println("==電影訊息系統==");
            System.out.println("1 、 查詢全部電影訊息");
            System.out.println("2 、 根據id查詢電影詳細訊息");
            System.out.println("請輸入命令");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    // 展示全部電影訊息
                    operator.printAllMovies();
                    break OUT;
                case 2:
                    // 根據id查詢電影詳細訊息
                    System.out.println("輸入要查詢的電影id");
                    int id = sc.nextInt();
                    operator.searchMovieById(id);
                    break OUT;
                default:
                    System.out.println("命令有誤");
            }
        }

    }
}
