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
        this.bill = "Base Price Of The Pizza: 300";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }
    boolean flag1 = true;
    public void addExtraCheese(){
        // your code goes here

        if(flag1){
            this.price = this.price + 80;
            this.bill = bill + "\nExtra Cheese Added: 80";
            flag1 = false;
        }

    }
    boolean flag2 = true;
    public void addExtraToppings(){
        // your code goes here

        if(flag2){

            if(isVeg){
                this.price = this.price + 70;
                this.bill = bill +"\nExtra Toppings Added: 70";
            }else{
                this.price = this.price + 120;
                this.bill = bill +"\nExtra Toppings Added: 120";
            }
            flag2 = false;
        }
    }
    boolean flag3 = true;
    public void addTakeaway(){
        // your code goes here

        if(flag3){
            this.price = this.price + 20;
            this.bill = bill +"\nPaperbag Added: 20";
            flag3 = false;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill = this.bill + "\nTotal Price: "+ price+'\n';
        return this.bill;
    }
}
