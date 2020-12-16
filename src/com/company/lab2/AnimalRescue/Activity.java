package com.company.lab2.AnimalRescue;

public class Activity {
    private String activityName = "Running in the park";
    private String location = "Central Park";
    private int levelOfSafety = 8;
    private double spaceInSquareFoot = 150.75;
    private String trees = "Yes";
    private String fence = "Yes";

    public String getActivityName(){
        return activityName;
    }
    public void setActivityName(String activityName){
        this.activityName=activityName;
    }

    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location=location;
    }

    public int getLevelOfSafety(){
        return levelOfSafety;
    }
    public void setLevelOfSafety(int levelOfSafety){
        this.levelOfSafety=levelOfSafety;
    }

    public double getSpaceInSquareFoot(){
        return  spaceInSquareFoot;
    }
    public void setSpaceInSquareFoot(double spaceInSquareFoot){
        this.spaceInSquareFoot=spaceInSquareFoot;
    }

    public String getTrees(){
        return trees;
    }
    public void setTrees(String trees){
        this.trees=trees;
    }

    public String getFence(){
        return fence;
    }
    public void setFence( String fence){
        this.fence=fence;
    }

}
