package com.gh;

/**
 * @Author Eric
 * @Date 2021/7/3 10:25
 * @Version 1.0
 */
public class User {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public User() {
    }

    public User(String name) {
        this.name = name;
    }
}
