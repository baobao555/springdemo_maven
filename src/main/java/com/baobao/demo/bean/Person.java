package com.baobao.demo.bean;

import java.util.Date;

/**
 * @author baobao
 * @create 2019-11-23 11:27
 * @description 演示依赖注入的bean
 *
 * 依赖注入：Dependency Injection。
 * 它是spring框架核心ioc的具体实现。 我们的程序在编写时，通过控制反转，把对象的创建交给了spring，
 * 但是代码中不可能出现没有依赖的情况。ioc解耦只是降低他们的依赖关系，但不会消除。
 * 例如：我们的业务层仍会调用持久层的方法。 那这种业务层和持久层的依赖关系，在使用spring之后，就让spring来维护了。
 * 简单的说，就是坐等框架把持久层对象传入业务层，而不用我们自己去获取。
 */
public class Person {
    private String name;
    private int age;
    private Date birthday;

    public Person() {
    }

    public Person(String name, int age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
