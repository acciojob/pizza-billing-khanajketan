package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);

        super.isDeluxe = true;
        if(isVeg){
            super.setPrice(300);
            super.setBill("Base Price Of The Pizza: 300");
        }
        else {
            super.setPrice(400);
            super.setBill("Base Price Of The Pizza: 400");
        }

    }
}
