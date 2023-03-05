package com.example.springmvc.model;

import com.example.springmvc.util.IdGenerator;

public class User {
    private int id;
    private String Username;
    private int age;
    private String email;
    private long phoneNumber;

    public User(){
    }

    public User(String username, int age, String email, long phoneNumber) {
        this.id = IdGenerator.userIdGenerator();
        Username = username;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = IdGenerator.userIdGenerator();
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
