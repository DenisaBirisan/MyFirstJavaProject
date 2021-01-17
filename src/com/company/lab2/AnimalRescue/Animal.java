package com.company.lab2.AnimalRescue;

public abstract class Animal {
    private String name;
    private int age;
    private double weight;
    private String color;
    private double heightInMeters;
    private String breed;
    private String eyeColor;
    private int healthLevel;
    private int hungerLevel;
    private String favoriteFood;
    private String facoriteActivity;

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }

    public String getEyeColor(){
        return eyeColor;
    }
    public void setEyeColor(String eyeColor){
        this.eyeColor=eyeColor;
    }

    public int getHealthLevel(){
        return healthLevel;
    }
    public void setHealthLevel(){
        this.healthLevel=healthLevel;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }

    public double getHeightInMeters(){
        return heightInMeters;
    }
    public void setHeightInMeters(double heightInMeters){
        this.heightInMeters=heightInMeters;
    }

    public String getColor(){
        return color;
    }
    public void setColor (String color){
        this.color=color;
    }

    public int getHungerLevel(){
        return hungerLevel;
    }
    public void setHungerLevel(int hungerLevel){
        this.hungerLevel=hungerLevel;
    }

    public String getFavoriteFood(){
        return favoriteFood;
    }
    public void setFavoriteFood(String favoriteFood){
        this.favoriteFood=favoriteFood;
    }

    public String getFacoriteActivity(){
        return facoriteActivity;
    }
    public void setFacoriteActivity(String facoriteActivity){
        this.facoriteActivity=facoriteActivity;
    }

    abstract void  speak();

    abstract void eat();


    abstract void sleep();


    abstract void play();


    abstract void cries();

    abstract void growls();

    abstract void sneez();

    abstract void  howls();


}











