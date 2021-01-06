package com.company.lab2.AnimalRescue;

public class Food {
    private String foodName;
    private double foodPrice;
    private double foodQty;
    private String foodStore;
    private String foodComposition;
    private String foodAvailability;

    public String getFoodName(){
        return foodName;
    }
    public void setFoodName(String foodName){
        this.foodName=foodName;
    }

    public double getFoodPrice(){
        return foodPrice;
    }
    public void setFoodPrice(double foodPrice){
        this.foodPrice=foodPrice;
    }

    public double getFoodQty(){
        return foodQty;
    }
    public void setFoodQty(double foodQty){
        this.foodQty=foodQty;
    }

    public String getFoodStore(){
        return foodStore;
    }
    public void setFoodStore(String foodStore){
        this.foodStore=foodStore;
    }

    public String getFoodComposition(){
        return foodComposition;
    }
    public void setFoodComposition(String foodComposition){
        this.foodComposition=foodComposition;
    }

    public String getFoodAvailability(){
        return foodAvailability;
    }
    public void setFoodAvailability(String foodAvailability){
        this.foodAvailability=foodAvailability;
    }

}

