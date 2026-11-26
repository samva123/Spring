package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context =  new ClassPathXmlApplicationContext("Beans.xml");
        //OrderService orderji = context.getBean(OrderService.class);
        // the above method will not work when we have the same class


        //2nd way by id
        OrderService orderji = (OrderService) context.getBean("orderService" , OrderService.class);


        orderji.pay();


    }
}