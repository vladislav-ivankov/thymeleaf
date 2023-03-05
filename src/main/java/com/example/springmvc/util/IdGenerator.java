package com.example.springmvc.util;

public class IdGenerator {
    private static int id;

    private IdGenerator(){
    }

    public static int userIdGenerator() {
        return ++id;
    }
}
