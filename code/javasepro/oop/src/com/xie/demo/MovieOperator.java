package com.xie.demo;

public class MovieOperator {
    private Movie[] movies;
    public MovieOperator(Movie[] movies){
        this.movies = movies;
    }

    // 展示全部電影訊息
    public void printAllMovies(){
        System.out.println("--------全部電影訊息如下---------");
        for(int i = 0; i < movies.length; i++){
            Movie m = movies[i];
            System.out.println("編號:" + m.getId());
            System.out.println("名稱:" + m.getName());
            System.out.println("價格:" + m.getPrice());
            System.out.println("=====================");
        }
    }

    // 根據編號查詢得到詳細資訊
    public void searchMovieById(int id){
        for(int i = 0; i < movies.length; i++){
            Movie m = movies[i];
            if(m.getId() == id){
                System.out.println("該電影資訊如下:");
                System.out.println("編號:" + m.getId());
                System.out.println("名稱:" + m.getName());
                System.out.println("價格:" + m.getPrice());
                System.out.println("評分:" + m.getScore());
                System.out.println("導演:" + m.getDirector());
                System.out.println("主演:" + m.getActor());
                System.out.println("其他:" + m.getInfo());
                return; // 找到電影訊息
            }
        }
        System.out.println("沒有該電影訊息");
    }

}
