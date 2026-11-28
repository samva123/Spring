package com.example.SpringCoreDemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;

@SpringBootApplication

//@SpringBootApplication(scanBasePackages = "")if we want to
//search into different folder

public class SpringCoreDemo2Application {

	public static void main(String[] args) {

		ApplicationContext context  =
				SpringApplication.run(SpringCoreDemo2Application.class, args);
		OrderService orderService = context.getBean(OrderService.class);
		orderService.placeOrder();
	}

}

//@AutoConfiguration is used by spring boot to create
//beans of some class that he create by himself 
