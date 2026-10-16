/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.atguigu02._class;

import org.junit.Test;

/**
 * ClassTest
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-10-16 22:15
 */
public class ClassTest {


    /**
     * 获取Class实例的几种方式（掌握前三种）
     */
    @Test
    public void test1() throws ClassNotFoundException {
        // 1. 调用运行时类的静态属性：class
        Class clazz1 = User.class;
        System.out.println(clazz1);

        //2. 调用运行时类的对象的getClass()
        User u1 = new User();
        Class clazz2 = u1.getClass();
        System.out.println(clazz2);

        System.out.println(clazz1 == clazz2);// true

        //3. 调用Class的静态方法forName(String className)
        String className = "com.fxy.atguigu02._class.User";// 全类名
        Class clazz3 = Class.forName(className);
        System.out.println(clazz3);

        //4. 使用类的加载器的方式
        Class clazz4 = ClassLoader.getSystemClassLoader().loadClass(className);
        System.out.println(clazz1 == clazz4);// true
    }


    @Test
    public void test2() {
        int[] a = new int[10];
        int[] b = new int[100];
        Class c10 = a.getClass();
        Class c11 = b.getClass();
        // 只要元素类型与维度一样，就是同一个Class
        System.out.println(c10 == c11);
    }

}
