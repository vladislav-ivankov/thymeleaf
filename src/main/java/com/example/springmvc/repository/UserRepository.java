package com.example.springmvc.repository;

import com.example.springmvc.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User());
    }

    public static List<User> getUserList() {
        return userList;
    }
}
