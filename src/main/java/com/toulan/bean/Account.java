package com.toulan.bean;

import java.io.Serializable;

/**
 * @Author LOL_toulan
 * @Time 2020/2/19 23:14
 * @Message
 */
public class Account implements Serializable {
    private String username;
    private Double money;
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", money=" + money +
                ", email='" + email + '\'' +
                '}';
    }
}
