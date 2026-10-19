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
        // 当且仅当一个类没有声明任何构造器时，javac 才会隐式补充一个默认构造器
        // 加了 Lombok 之后 newInstance() 报 InstantiationException——需要显式写 @NoArgsConstructor 才把无参构造器加回来
        Person per = (Person) clazz.newInstance();
        System.out.println(per);
    }

}
