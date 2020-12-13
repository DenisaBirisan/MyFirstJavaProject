package com.company.lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        System.out.println(myDog.age);
        System.out.println(myDog.eyeColor);
        System.out.println(myDog.healthLevel);
        System.out.println(myDog.name);


        myDog.bark();
        myDog.eat();

        myDog.name="Pluto";
        System.out.println(myDog.name);

        Girl myGirl = new Girl();

        System.out.println(myGirl.girlName);
        System.out.println(myGirl.dogLoveLevel);
        System.out.println(myGirl.spaceAvailable);

        myGirl.feed();
        myGirl.train();

        DogFood myDogFood = new DogFood();

        System.out.println(myDogFood.dogFoodName);
        System.out.println(myDogFood.dogFoodPrice);
        System.out.println(myDogFood.dogFoodStore);

        Vet myVet = new Vet();

        System.out.println(myVet.vetName);
        System.out.println(myVet.levelOfExperience);
        System.out.println(myVet.vetLocation);

        myVet.consults();
        myVet.treats();

        Activity myActivity = new Activity();

        System.out.println(myActivity.activityName);
        System.out.println(myActivity.spaceInSquareFoot);
        System.out.println(myActivity.levelOfSafety);

    }

}
