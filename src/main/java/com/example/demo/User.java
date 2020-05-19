package com.example.demo;

public class User {
    private Integer id;
    private String email;
    private String name;
    private String application;

    //新增一个set方法
    public void setId(Integer id) {
        this.id = id;
    }

    //新增一个set方法
    public void setName(String name) {
        this.name = name;
    }
    //新增一个get方法
    public Integer getId() {
        return id;
    }
}
