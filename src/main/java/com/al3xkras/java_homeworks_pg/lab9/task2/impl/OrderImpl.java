package com.al3xkras.java_homeworks_pg.lab9.task2.impl;

import com.al3xkras.java_homeworks_pg.lab9.task2.Customer;
import com.al3xkras.java_homeworks_pg.lab9.task2.Order;

public record OrderImpl(
        int orderNumber,
        Customer customer,
        double value) implements Order {
}

