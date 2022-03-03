package com.springbootcamp.demo.springbasics2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


// while using component on both tea and coffee will create ambiguity
// to resolve that applying primary along with component ---->Q5
@Primary
@Component
public class Tea implements HotDrinks{
    public void prepareHotDrink(){
        System.out.println("Preparing HotDrink Tea");
    }
}
