package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        super.setPrice(450);
        super.isDeluxe = true;
        super.setBill("Veg Deluxe pizza price : 450");

    }
}
