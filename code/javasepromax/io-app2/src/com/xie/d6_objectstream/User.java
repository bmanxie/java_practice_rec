package com.xie.d6_objectstream;

import java.io.Serializable;
// 住要: 對象需要序列化，必須先實現序列化接口
public class User implements Serializable {
    private String loginName;
    private String userName;
    private int age;
    // transient 這個成員變量將不參與序列化
    private transient String paasWord;

    public User() {
    }

    public User(String loginName, String userName, int age, String paasWord) {
        this.loginName = loginName;
        this.userName = userName;
        this.age = age;
        this.paasWord = paasWord;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPaasWord() {
        return paasWord;
    }

    public void setPaasWord(String paasWord) {
        this.paasWord = paasWord;
    }

    @Override
    public String toString() {
        return "User{" +
                "loginName='" + loginName + '\'' +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", paasWord='" + paasWord + '\'' +
                '}';
    }
}
