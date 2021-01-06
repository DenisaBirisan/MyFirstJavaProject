package com.company.lab2.AnimalRescue;

public class Girl extends Human {

    private String spaceAvailable;
    private int timeAvailable;
    private int disponibilityLevel;
    private int confidenceLevel;
    private int dogLoveLevel;
    private String dogHouseColor;


    public String getSpaceAvailable(){
        return spaceAvailable;
    }
    public void setSpaceAvailable(String spaceAvailable){
        this.spaceAvailable=spaceAvailable;
    }

    public int getDogLoveLevel(){
        return dogLoveLevel;
    }
    public void setDogLoveLevel(int dogLoveLevel){
        this.dogLoveLevel=dogLoveLevel;
    }


    public int getTimeAvailable(){
        return timeAvailable;
    }
    public void setTimeAvailable(int timeAvailable){
        this.timeAvailable=timeAvailable;
    }

    public int getDisponibilityLevel(){
        return  disponibilityLevel;
    }
    public void setDisponibilityLevel(int disponibilityLevel){
        this.disponibilityLevel=disponibilityLevel;
    }

    public int getConfidenceLevel(){
        return confidenceLevel;
    }
    public void setConfidenceLevel(int confidenceLevel){
        this.confidenceLevel=confidenceLevel;
    }

    public String getDogHouseColor(){
        return dogHouseColor;
    }
   public void setDogHouseColor(String dogHouseColor){
        this.dogHouseColor=dogHouseColor;
   }

    void play(){
        System.out.println("Ready? Go!");
    }

    void feed(){
        System.out.println("Here is your food, Luna!");
    }

    void pet(){
        System.out.println("Good girl!");
    }

    void train(){
        System.out.println("Sit! Give me paw!");
    }

    void wash(){
        System.out.println("Let's give you a nice bath! :)");
    }

    void takesDogToVet(){
        System.out.println("Oh no! Let's go to the vet to treat the wound!");
    }








}
