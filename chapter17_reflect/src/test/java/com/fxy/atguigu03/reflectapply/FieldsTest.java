/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.atguigu03.reflectapply;

import com.fxy.atguigu03.reflectapply.data.Person;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * FieldsTest
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-10-17 23:28
 */
public class FieldsTest {

    @Test
    public void test1() {
        Class clazz = Person.class;
        // getFields() :获取当前运行时类及其父类中声明为public的权限修饰的属性
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("============================================================");
        // getDeclaredFields() ；获取当前运行时类 中声明的所有属性(不包含父类中的属性)
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
    }

    @Test
    public void test2() {
        Class<Person> clazz = Person.class;
        Field[] declaredFields = clazz.getDeclaredFields();

        for (Field f : declaredFields) {
            // 权限修饰符
            int modifier = f.getModifiers();
            System.out.println(modifier + ":" + Modifier.toString(modifier) + "\t");
            System.out.println("========================");

            // 数据类型
            Class type = f.getType();
            System.out.println(type.getName() + "\t");
            System.out.println("========================");


            // 变量名
            String name = f.getName();
            System.out.println(name + "\t");
            System.out.println("========================");
        }


    }

}
