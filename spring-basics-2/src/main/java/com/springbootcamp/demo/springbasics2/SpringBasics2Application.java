package com.springbootcamp.demo.springbasics2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasics2Application {

	public static void main(String[] args) {

		// Q4 get bean from application context and displaying its properties
		ApplicationContext applicationContext = SpringApplication.run(SpringBasics2Application.class, args);

		Restaurant restaurant = applicationContext.getBean(Restaurant.class);
		restaurant.getHotDrinks().prepareHotDrink();
	}

}
