/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.atguigu03.reflectapply;

import com.fxy.atguigu03.reflectapply.data.Person;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ReflectTest
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-10-19 19:55
 */
public class ReflectTest {


    @Test
    public void test2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class clazz = Person.class;

        Person person = (Person) clazz.newInstance();

        Method method = clazz.getDeclaredMethod("showNation", String.class, int.class);

        method.setAccessible(true);
        String res = (String) method.invoke(person, "china", 13);
        System.out.println(res);

        Method showInfoMethod = clazz.getMethod("showInfo");
        // 调用static方法，object可以传null
        showInfoMethod.invoke(null);


    }

}
