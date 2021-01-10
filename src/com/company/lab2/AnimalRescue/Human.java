package com.company.lab2.AnimalRescue;

public class Human {
    private String name;
    private int age;
    private double money;
    private String placeOfBirth;
    private String currentlyLiving;


    public String getName(){
        return name;
    }
    public void setGirlName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public double money(){
        return money;
    }
    public void setMoney(int money){
        this.money=money;
    }
    public String getPlaceOfBirth(){return placeOfBirth;}
    public void setPlaceOfBirth(String placeOfBirth){this.placeOfBirth=placeOfBirth;}
    public String getCurrentlyLiving(){return currentlyLiving;}
    public void setCurrentlyLiving(String currentlyLiving){this.currentlyLiving=currentlyLiving;}

    public void speak(){
        System.out.println("Good afternoon doctor!");
    }

    public void ask(){
        System.out.println("I need medicine for my dog!");
    }
    public void greet(){
        System.out.println("Goodbye");
    }
    public void walk(){
        System.out.println("Lalalala!");
    }
    public void sing(){
        System.out.println("Last Christmas I gave you my heeaarrtt!!");
    }

}
