package com.codewithmosh.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) throws IllegalAccessException {
//		SpringApplication.run(StoreApplication.class, args);
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

		var UserService = context.getBean(UserService.class);

		var orderService = context.getBean(OrderService.class);
//		var nonsensitive =context.getBean(NotificationService.class);
//		var orderService = new OrderService(new PayPalService());
//		orderService.setPaymentService(new PayPalService());
		UserService.registerUser(new User(1L,"asdasasdasdas","asdasdasdasdasd","Mosh"));
		orderService.placeOrder();
//		nonsensitive.SendMessage("THis is message 123213113");

	}


}
