package com.company.lab2.AnimalRescue;

public class Activity {
    private String activityName;
    private String location;
    private int levelOfSafety;
    private double spaceInSquareFoot;
    private String trees;
    private String fence;

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
