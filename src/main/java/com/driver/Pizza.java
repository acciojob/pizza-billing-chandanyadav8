package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraTopping=0;
    private int extraCheese=0;
    private int paperbag=0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg)
        price=300;
        else
            price=400;

    }



    public int getPrice(){
        return this.price;
    }
public void setPrice(int price)
{
    this.price=price;
}
    public void addExtraCheese(){
        // your code goes here
        extraCheese+=80;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg)
            extraTopping+=70;
        else
            extraTopping+=120;

    }

    public void addTakeaway(){
        // your code goes here
        paperbag=20;
    }

    public String getBill(){
        // your code goes here
        int total=price+extraCheese+extraTopping+paperbag;
        bill="Base Price Of The Pizza: "+price+"\n" +
                "Extra Cheese Added: "+extraCheese+"\n" +
                "Extra Toppings Added: "+extraTopping+"\n" +
                "Paperbag Added: "+paperbag+"\n" +
                "Total Price: "+total;
        return this.bill;
    }
}
