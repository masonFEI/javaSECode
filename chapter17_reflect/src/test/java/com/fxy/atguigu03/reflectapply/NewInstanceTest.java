/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.atguigu03.reflectapply;

import com.fxy.atguigu03.reflectapply.data.Person;
import org.junit.Test;

/**
 * NewInstanceTest
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-10-17 21:46
 */
public class NewInstanceTest {


    @Test
    public void test1() throws InstantiationException, IllegalAccessException {
        Class clazz = Person.class;
        // newInstance() 相当于 new Person()，要求 Person 存在 public 的无参构造器；
        // 且一旦显式定义了任意构造器，编译器就不再自动补空参，必须自己写
        Person per = (Person) clazz.newInstance();
        System.out.println(per);
    }

}
