/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.atguigu01.example;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ReflectionTest
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-10-13 22:45
 */
public class ReflectionTest {

    @Test
    public void test1() {
        Person p1 = new Person();
        p1.age = 10;
        System.out.println(p1.age);

        p1.show();
    }

    /**
     * 使用反射完成上述的操作
     */
    @Test
    public void test2() throws InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {

        Class clazz = Person.class;
        Person p1 = (Person) clazz.newInstance();
        System.out.println(p1);

        Field ageField = clazz.getField("age");
        ageField.set(p1, 10);
        System.out.println(ageField.get(p1));


        Method showMethod = clazz.getMethod("show");
        showMethod.invoke(p1);
    }

}