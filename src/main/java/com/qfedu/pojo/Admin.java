package com.qfedu.pojo;

/**
 * projectName: gitdemo
 *
 * @author: 张剑
 * time: 2020/10/11 0011 上午 11:23
 * description:
 */
public class Admin {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
