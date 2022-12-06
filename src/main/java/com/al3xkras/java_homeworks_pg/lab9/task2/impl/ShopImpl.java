package com.al3xkras.java_homeworks_pg.lab9.task2.impl;

import com.al3xkras.java_homeworks_pg.lab9.task2.Order;
import com.al3xkras.java_homeworks_pg.lab9.task2.Shop;

import java.util.List;

public class ShopImpl implements Shop {
    private final List<Order> orderList;
    public ShopImpl(List<Order> orderList) {
        this.orderList = orderList;
    }
    public void printAllOrders() {
        for (Order myOrder : orderList) {
            System.out.println("Order number:  " + myOrder.orderNumber());
            System.out.println("Order value:   " + myOrder.value());
            System.out.println("Customer id:   " + myOrder.customer().customerNumber());
        }
    }
}

