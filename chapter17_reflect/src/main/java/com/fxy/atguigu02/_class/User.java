/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.atguigu02._class;

/**
 * User
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-10-16 22:13
 */
public class User {

    private String name;

    public int age;

    public User() {

    }

    public User(int age) {
        this.age = age;
    }

    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
