/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.atguigu01.example;

/**
 * Person
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-10-13 22:39
 */
public class Person {

    private String name;

    public int age;

    // 构造器
    public Person() {
        System.out.println("Person()...");
    }

    public Person(int age) {
        this.age = age;
    }

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("你好，我是一个Person");
    }

    private String showNation(String nation) {
        return "我的国籍是：" + nation;
    }

    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}