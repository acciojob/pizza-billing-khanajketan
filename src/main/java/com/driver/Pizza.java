package com.driver;

public class Pizza {

    private int price = 300;
    public boolean isDeluxe = false;

    public void setPrice(int price) {
        this.price = price;
    }

    private Boolean isVeg;
    private String bill;

    public void setBill(String bill) {
        this.bill = bill;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg) this.price = 300;
        else this.price = 400;
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }
    boolean flag1 = true;
    public void addExtraCheese(){
        // your code goes here

        if(flag1 && !isDeluxe){
            this.price = this.price + 80;
            this.bill = bill + "\nExtra Cheese Price : 80";
            flag1 = false;
        }

    }
    boolean flag2 = true;
    public void addExtraToppings(){
        // your code goes here

        if(flag2 && !isDeluxe){

            if(isVeg){
                this.price = this.price + 70;
                this.bill = bill +"\nExtra Toppings For Veg Pizza : 70";
            }else{
                this.price = this.price + 120;
                this.bill = bill +"\nExtra Toppings For Non-veg Pizza : 120";
            }
            flag2 = false;
        }
    }
    boolean flag3 = true;
    public void addTakeaway(){
        // your code goes here

        if(flag3){
            this.price = this.price + 20;
            this.bill = bill +"\nPaper bag Price : 20";
            flag3 = false;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill = this.bill + "\nTotal Price : "+ price;
        return this.bill;
    }
}
