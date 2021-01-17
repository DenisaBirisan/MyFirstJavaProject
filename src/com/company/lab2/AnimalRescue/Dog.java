package com.company.lab2.AnimalRescue;

public class Dog extends Animal {

    public void speak(){
        System.out.println("Hamham!");
    }
    public void eat(){
        System.out.println("Yummy");
    }
    public void sleep(){
        System.out.println("ZZZZzzzzzZZZZzzz!");
    }
    public void play(){
        System.out.println("This is FUUUN");
    }
    public void cries(){
        System.out.println("I'm sssaaaadd!");
    }
    public void growls(){
        System.out.println("Grrrrrr!");
    }
    public void sneez(){
        System.out.println("Hapciuu!");
    }
    public void howls(){
        System.out.println("Auuu!");
    }

    private String dogCollarColor;

    public String getDogCollarColor() {
        return dogCollarColor;
    }

    public void setDogCollarColor(String dogCollarColor) {
        this.dogCollarColor = dogCollarColor;
    }

}



