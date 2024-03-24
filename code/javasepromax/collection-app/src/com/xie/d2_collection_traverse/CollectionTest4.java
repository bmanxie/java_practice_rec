package com.xie.d2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 目標: 完成電影訊息的展示
 * new Movie ("沙丘: 第二部 Dune: Part Two", 9.5, "提摩西·夏勒梅");
 * new Movie ("功夫熊貓4 Kung Fu Panda 4", 8.4, "阿波");
 * new Movie ("復仇者聯盟4：終局之戰 Avengers: Endgame", 9.2, "小勞勃·約翰·道尼");
 */
public class CollectionTest4 {
    public static void main(String[] args) {
        // 1. 創建集合容器儲存多不電影對象
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie ("沙丘: 第二部 Dune: Part Two", 9.5, "提摩西·夏勒梅"));
        movies.add(new Movie ("功夫熊貓4 Kung Fu Panda 4", 8.4, "阿波"));
        movies.add(new Movie ("復仇者聯盟4：終局之戰 Avengers: Endgame", 9.2, "小勞勃·約翰·道尼"));
        System.out.println(movies);

        for (Movie movie : movies) {
            System.out.println("電影名稱" + movie.getName());
            System.out.println("評分" + movie.getScore());
            System.out.println("主演" + movie.getActor());
            System.out.println("-------------");
        }
    }
}
