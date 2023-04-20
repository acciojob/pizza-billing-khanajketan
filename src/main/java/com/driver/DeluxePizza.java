package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);

        super.isDeluxe = true;
        if(isVeg){
            super.setPrice(450);
            String str = "Base Price Of The Pizza: 300\nExtra Cheese Added: 80\nExtra Toppings Added: 120";
            super.setBill(str);
        }
        else {
            super.setPrice(600);
            super.setBill("Base Price Of The Pizza: 400\n Extra Cheese Added: 80\nExtra Toppings Added: 120");
        }

    }
}
