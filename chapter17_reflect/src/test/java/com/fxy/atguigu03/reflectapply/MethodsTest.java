/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.atguigu03.reflectapply;

import com.fxy.atguigu03.reflectapply.data.Person;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * MethodsTest
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-10-18 20:40
 */
public class MethodsTest {


    @Test
    public void test1() {
        Class clazz = Person.class;
        // getMethods():获取当前运行时类及其所有父类中声明为public权限的方法
        Method[] methods = clazz.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }


        System.out.println("====================================");

        // getDeclaredMethods():获取当前运行时类中声明的所有方法（包括private、protected、默认、public，但不包括父类中声明的方法）
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m : declaredMethods) {
            System.out.println(m);
        }
    }


    /**
     * 注解信息
     * 权限修饰符  返回值类型  方法名（形参类型1 参数1，形参类型2 参数2）
     */
    @Test
    public void test2() {
        Class clazz = Person.class;
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m : declaredMethods) {
            // 1.获取方法声明的注解
            Annotation[] annotations = m.getAnnotations();
            for (Annotation a : annotations) {
                System.out.print(a + "\t");
            }

            // 权限修饰符
            System.out.println(Modifier.toString(m.getModifiers()) + "\t");

            // 返回值类型
            System.out.print(m.getReturnType().getName() + "\t");

            System.out.println(m.getName());

            // 形参列表
            System.out.print("(");
            Class[] parameterTypes = m.getParameterTypes();
            if (!(parameterTypes == null || parameterTypes.length == 0)) {
                for (int i = 0; i < parameterTypes.length; i++) {
                    if (i == parameterTypes.length - 1) {
                        System.out.print(parameterTypes[i].getName() + " args_" + i);
                        break;
                    }
                    System.out.print(parameterTypes[i].getName() + " args_" + i + ",");
                }
            }
            System.out.print(")");
            System.out.println();

            System.out.println("-------------------------------");
        }
    }

}
