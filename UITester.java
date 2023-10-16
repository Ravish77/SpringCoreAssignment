package com.accenture.lkm.ui;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.accenture.lkm.beans.Order;
import com.accenture.lkm.collectioninject.CollectionTester;

public class UITester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/accenture/lkm/resources/spring-main.xml");
		
		CollectionTester collection = (CollectionTester) applicationContext.getBean("collectionListObject");
		
		List<Order> orderList = collection.getOrderList();
//		orderList.get(0).displayOrderDetails();
//		orderList.get(1).displayOrderDetails();
//		orderList.get(2).displayOrderDetails();
//		orderList.get(3).displayOrderDetails();
		
		Iterator<Order> iterator = orderList.iterator();
		while (iterator.hasNext()) {
			iterator.next().displayOrderDetails();
			System.out.println("\n");
		}
		
		
		
	}

}
