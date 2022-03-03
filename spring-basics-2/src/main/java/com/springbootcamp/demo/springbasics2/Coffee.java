package com.springbootcamp.demo.springbasics2;


import org.springframework.stereotype.Component;

@Component
public class Coffee implements HotDrinks{

    public void prepareHotDrink(){
        System.out.println("Preparing HotDrink Coffee");
    }
}
