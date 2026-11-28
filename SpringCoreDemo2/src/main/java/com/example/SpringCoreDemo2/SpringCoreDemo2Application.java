package com.example.SpringCoreDemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class SpringCoreDemo2Application {

	public static void main(String[] args) {

		ApplicationContext context  =
				SpringApplication.run(SpringCoreDemo2Application.class, args);
		OrderService orderService = context.getBean(OrderService.class);
		orderService.placeOrder();
	}

}
