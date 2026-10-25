/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy;

/**
 * Person
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-10-25 12:19
 */
public class Person {


    String name;
    int age;

    public void eat() {
        System.out.println("人吃饭");
    }

}

class Student extends Person {

    @Override
    public void eat() {
        System.out.println("学生吃饭");
    }

}
