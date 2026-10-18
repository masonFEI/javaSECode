/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.atguigu03.reflectapply;

import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * OtherTest
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-10-18 21:52
 */
public class OtherTest {


    // 获取运行时类的父类
    @Test
    public void test1() throws ClassNotFoundException {
        Class clazz = Class.forName("com.fxy.atguigu03.reflectapply.data.Person");
        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);
    }

    // 获取运行时类实现的接口
    @Test
    public void test2() throws ClassNotFoundException {
        Class clazz = Class.forName("com.fxy.atguigu03.reflectapply.data.Person");
        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println(i);
        }
    }

    // 获取运行时类所在的包
    @Test
    public void test3() throws ClassNotFoundException {
        Class clazz = Class.forName("com.fxy.atguigu03.reflectapply.data.Person");
        Package p = clazz.getPackage();
        System.out.println(p);
    }


    // 获取运行时类的带泛型的父类
    @Test
    public void test4() throws ClassNotFoundException {
        Class clazz = Class.forName("com.fxy.atguigu03.reflectapply.data.Person");
        Type superclass = clazz.getGenericSuperclass();
        System.out.println(superclass);
    }

    // 获取运行时类的父类的泛型
    @Test
    public void test5() throws ClassNotFoundException {
        Class clazz = Class.forName("com.fxy.atguigu03.reflectapply.data.Person");
        Type superclass = clazz.getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) superclass;
        // 调用getActualTypeArguments() 获取泛型的参数，结果是一个数组，因为可能有多个泛型参数
        Type[] typeArgs = pt.getActualTypeArguments();
        for (Type t : typeArgs) {
            System.out.println(t);
        }
    }

}
