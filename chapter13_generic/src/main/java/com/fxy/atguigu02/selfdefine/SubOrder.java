/**
 * LY.com Inc.
 * Copyright (c) 2004-2026 All Rights Reserved.
 */
package com.fxy.atguigu02.selfdefine;

/**
 * SubOrder
 *
 * @author feixuanyu
 * @version 1.0.0
 * @since 2026-10-24 20:13
 */
public class SubOrder<T, E> extends Order<T> {

    E e;

    public SubOrder(T t, String orderId, E e) {
        super(t, orderId);
        this.e = e;
    }

    @Override
    public String toString() {
        return "SubOrder{" +
                "e=" + e +
                ", t=" + t +
                ", orderId='" + orderId + '\'' +
                '}';
    }
}
