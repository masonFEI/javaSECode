/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.atguigu01.example;

import org.junit.Test;

import java.lang.reflect.Constructor;
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

    /**
     * 除了Person类之后，就不能直接调用Person类中声明的private权限修饰的结构（属性，方法，构造器）
     * <p>
     * 但是我们可以通过反射的方式，调用Person类中声明的private权限修饰的结构 --> 暴力反射
     *
     */
    @Test
    public void test3() throws Exception {
        Class clazz = Person.class;

        // 1.调用私有构造器
        Constructor constructor = clazz.getDeclaredConstructor(String.class, int.class);

        constructor.setAccessible(true);//避免调用私有结构报错，IllegalAccessException
        Person p1 = (Person) constructor.newInstance("Tom", 12);
        System.out.println(p1);

        // 2.调用私有属性
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);//避免调用私有结构报错，IllegalAccessException
        nameField.set(p1, "Jerry");
        System.out.println(nameField.get(p1));

        // 3.调用私有方法
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);//避免调用私有结构报错，IllegalAccessException
        Object returnVal = showNation.invoke(p1, "中国");
        System.out.println(returnVal);
    }

}