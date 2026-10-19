/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.atguigu04.other;

import java.lang.reflect.Constructor;

/**
 * ReflectTest
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-10-19 23:19
 */
public class ReflectTest {


    /**
     *
     * 反射的动态性
     *
     * @param className
     * @param <T>
     * @return
     * @throws Exception
     */
    public <T> T getInstance(String className) throws Exception {
        Class clazz = Class.forName(className);
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        return (T) constructor.newInstance();
    }

}
