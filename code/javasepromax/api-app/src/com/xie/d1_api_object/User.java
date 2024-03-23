package com.xie.d1_api_object;
// Cloneable 是個標記介面
public class User implements Cloneable{
    private int id; //編號
    private String username; // 用戶名
    private String password; // 密碼
    private double[] scores; // 分數

    public User() {
    }

    public User(int id, String username, String password, double[] scores) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.scores = scores;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // super調用父類Object中的clone方法
        User u = (User) super.clone();
        u.scores = u.scores.clone();
        return u;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }
}
