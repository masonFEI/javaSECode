/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.atguigu02.selfdefine;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * GenericTest
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-10-24 21:44
 */
public class GenericTest {


    @Test
    public void test2() {

        List<?> list = null;

        List<String> list1 = new ArrayList<>();
        list1.add("AA");

        list = list1;

        System.out.println(list.get(0));

        // 写入数据，操作失败
//        list.add("BB");

        // 将null写入集合中
        list.add(null);

    }

}
