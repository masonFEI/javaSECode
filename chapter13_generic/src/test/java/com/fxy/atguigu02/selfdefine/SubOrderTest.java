/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.atguigu02.selfdefine;

import org.junit.Test;

/**
 * SubOrderTest
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-10-24 20:17
 */
public class SubOrderTest {


    @Test
    public void test1() {
        SubOrder<String, Integer> subOrder = new SubOrder<>("1", "id", 1);
        System.out.println(subOrder);
    }

}
