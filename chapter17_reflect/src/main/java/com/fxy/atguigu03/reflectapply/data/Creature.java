/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.atguigu03.reflectapply.data;

/**
 * Creature
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-10-17 23:12
 */
public class Creature<T> {

    boolean gender;
    public int id;

    public void breath() {
        System.out.println("呼吸");
    }

    private void info() {
        System.out.println("我是一个生物");
    }

}
