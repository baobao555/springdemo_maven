package com.baobao.domain;

import java.io.Serializable;

/**
 * @author baobao
 * @create 2019-11-25 0:07
 * @description
 */
public class Account implements Serializable {
    private int id;
    private String name;
    private float money;

    public Account() {
    }

    public Account(String name, float money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }
}
