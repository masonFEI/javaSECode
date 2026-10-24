/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.atguigu02.selfdefine;

/**
 * Order
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-10-24 20:13
 */
public class Order<T> {

    protected T t;


    String orderId;


    public Order(T t, String orderId) {
        this.t = t;
        this.orderId = orderId;
    }

    // 自定义泛型方法
    public <E> E method(E e) {
        return null;
    }

}
