package com.al3xkras.java_homeworks_pg.lab9.task2;

import com.al3xkras.java_homeworks_pg.lab9.task2.impl.CustomerImpl;
import com.al3xkras.java_homeworks_pg.lab9.task2.impl.OrderImpl;
import com.al3xkras.java_homeworks_pg.lab9.task2.impl.ShopImpl;

import java.util.ArrayList;
import java.util.List;

public class ShopDemo {

	public static void main(String[] args) {
		List<Order> allOrders = new ArrayList<>();
		for (int i=0; i<10; i++) {
			Customer myCustomer = new CustomerImpl(i+10);
			Order myOrder = new OrderImpl(i+1, myCustomer, 50 + 100 * i);
			allOrders.add(myOrder);
		}
		
		Shop myShop = new ShopImpl(allOrders);
		myShop.printAllOrders();
	}
}
