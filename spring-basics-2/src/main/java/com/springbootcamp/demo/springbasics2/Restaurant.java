package com.springbootcamp.demo.springbasics2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


// Q3 using component and autowired
@Component
public class Restaurant {

    @Autowired
    HotDrinks hotDrinks;

    public HotDrinks getHotDrinks() {
        return hotDrinks;
    }



    // Constructor injection --> Q6
    Restaurant(HotDrinks hotDrinks) {
        super();
        this.hotDrinks = hotDrinks;
    }
}
