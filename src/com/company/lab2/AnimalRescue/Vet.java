package com.company.lab2.AnimalRescue;

public class Vet {
    private String vetName;
    private int vetAge;
    private String vetCertification;
    private int levelOfExperience;
    private String vetSpecialty;
    private String vetLocation;
    private int levelOfPatience;
    private int levelOfKindness;
    private double pricePerMeeting;

    public String getVetName(){
        return vetName;
    }
    public void setVetName(String vetName){
        this.vetName=vetName;
    }

    public int getVetAge(){
        return vetAge;
    }
    public void setVetAge(int vetAge){
        this.vetAge=vetAge;
    }

    public String getVetCertification(){
        return vetCertification;
    }
    public void setVetCertification(String vetCertification){
        this.vetCertification=vetCertification;
    }

    public int getLevelOfExperience(){
        return levelOfExperience;
    }

    public void setLevelOfExperience(int levelOfExperience){
        this.vetCertification=vetCertification;
    }

    public String getVetSpecialty(){
        return vetSpecialty;
    }
    public void setVetSpecialty(String vetSpecialty){
        this.vetSpecialty=vetSpecialty;
    }

    public String getVetLocation(){
        return vetLocation;
    }
    public void setVetLocation(String vetLocation){
        this.vetLocation=vetLocation;
    }

    public int getLevelOfPatience(){
        return levelOfPatience;
    }
    public void setLevelOfPatience(int levelOfPatience){
        this.levelOfPatience=levelOfPatience;
    }

    public int getLevelOfKindness(){
        return levelOfKindness;
    }
    public void setLevelOfKindness(int levelOfKindness){
        this.levelOfKindness=levelOfKindness;
    }

    public double getPricePerMeeting(){
        return pricePerMeeting;
    }
    public void setPricePerMeeting(double pricePerMeeting){
        this.pricePerMeeting=pricePerMeeting;
    }



    void consults(){
        System.out.println("*the vet consults* Let's see what we have here!");
    }
    void treats(){
        System.out.println("*the vet treats the wound");
    }
    void givesMedication(){
        System.out.println("*the vet gives meds to the dog");
    }
    void writesPrescriptin(){
        System.out.println("the vet writes prescription");
    }
    void  asksForPayment(){
        System.out.println("Give me the money! :)");
    }





}
