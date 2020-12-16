package com.company.lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        System.out.println(myDog.getAge());
        System.out.println(myDog.getEyeColor());
        System.out.println(myDog.getHealthLevel());
        System.out.println(myDog.getName());

        myDog.setName("Pluto");

        System.out.println(myDog.getName());


        myDog.bark();
        myDog.eat();



        Girl myGirl = new Girl();

        System.out.println(myGirl.getGirlName());
        System.out.println(myGirl.getDogLoveLevel());
        System.out.println(myGirl.getSpaceAvailable());

        myGirl.setGirlName("Sarah");
        System.out.println(myGirl.getGirlName());

        myGirl.feed();
        myGirl.train();

        DogFood myDogFood = new DogFood();

        System.out.println(myDogFood.getDogFoodName());
        System.out.println(myDogFood.getDogFoodPrice());
        System.out.println(myDogFood.getDogFoodStore());

        myDogFood.setDogFoodName("Best Bones Ever");
        System.out.println(myDogFood.getDogFoodName());

        Vet myVet = new Vet();

        System.out.println(myVet.getVetName());
        System.out.println(myVet.getLevelOfExperience());
        System.out.println(myVet.getVetLocation());

        myVet.setVetLocation("Far Away, no.20");
        System.out.println(myVet.getVetLocation());

        myVet.consults();
        myVet.treats();

        Activity myActivity = new Activity();

        System.out.println(myActivity.getActivityName());
        System.out.println(myActivity.getSpaceInSquareFoot());
        System.out.println(myActivity.getLocation());

        myActivity.setLocation("Somewhere");
        System.out.println(myActivity.getLocation());

    }

}
