/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.atguigu02._class;

import org.junit.Test;

import java.io.*;
import java.util.Properties;

/**
 * ClassLoaderTest
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-10-17 20:23
 */
public class ClassLoaderTest {


    /**
     * 在jdk8中执行如下代码
     */
    @Test
    public void test1() {
        // 获取系统类加载器
        ClassLoader classLoader1 = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader1);

        ClassLoader classLoader2 = ClassLoader.getSystemClassLoader().getParent();
        System.out.println(classLoader2);

        ClassLoader classLoader3 = classLoader2.getParent();
        System.out.println(classLoader3);

    }

    @Test
    public void test2() throws ClassNotFoundException {
        Class clazz = User.class;
        // 用户自定义类使用的是系统类加载器加载的
        ClassLoader classLoader = clazz.getClassLoader();
        System.out.println(classLoader);

        Class clazz1 = Class.forName("java.lang.String");
        System.out.println(clazz1.getClassLoader());
    }

    // 需求：通过ClassLoader加载指定的配置文件
    @Test
    public void test3() throws IOException {
        Properties pros = new Properties();
        // 通过类加载器读取资源，资源名相对于 classpath 根（即 src/main/resources 编译后的产物目录 target/classes）
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("info.properties");

        pros.load(is);
        System.out.println(pros.getProperty("name"));
        System.out.println(pros.getProperty("password"));
    }


    // Properties:处理属性文件
    @Test
    public void test4() throws IOException {
        Properties pros = new Properties();
        // FileInputStream 走文件系统相对路径，基准是进程工作目录（IDEA/Maven 下即模块根目录）
        FileInputStream is = new FileInputStream("src/main/resources/info.properties") ;

        pros.load(is);
        System.out.println(pros.getProperty("name"));
        System.out.println(pros.getProperty("password"));
    }

}
