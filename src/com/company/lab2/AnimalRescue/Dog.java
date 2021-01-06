package com.company.lab2.AnimalRescue;

public class Dog extends Animal{

    private String dogCollarColor;
    public String getDogCollarColor(){
        return dogCollarColor;
    }
    public void setDogCollarColor(String dogCollarColor){
        this.dogCollarColor=dogCollarColor;
    }


    void bark(){
        System.out.println("Ham Ham!");
    }

    void eat(){
        System.out.println("eating dogfood!");
    }

    void sleep(){
        System.out.println("ZzzzZzzz..");
    }

    void play(){
        System.out.println("This is fun! *talking to himself*");
    }

    void cries(){
        System.out.println("It huuuuuurtttss!");
    }

    void growls(){
        System.out.println("I'm hangry! Give me food!");
    }

    void sneez(){
        System.out.println("Uoaaaaah, I'm sleepy!");
    }

    void  howls(){
        System.out.println("When I grow up I wanna be a wolf!:D");
    }
}
