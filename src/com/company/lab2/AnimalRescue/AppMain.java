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

        myGirl.setGirlName("Sarah");
        System.out.println(myGirl.getName());
        myGirl.setDogLoveLevel(10);
        System.out.println(myGirl.getDogLoveLevel());
        myGirl.setSpaceAvailable("nice space");
        System.out.println(myGirl.getSpaceAvailable());

        myGirl.setGirlName("Sarah");
        System.out.println(myGirl.getName());

        myGirl.feed();
        myGirl.train();

        DogFood myDogFood = new DogFood();

        System.out.println(myDogFood.getFoodName());
        System.out.println(myDogFood.getFoodPrice());
        System.out.println(myDogFood.getFoodStore());

        myDogFood.setFoodName("Best Bones Ever");
        System.out.println(myDogFood.getFoodName());

        Vet myVet = new Vet();

        System.out.println(myVet.getName());
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


        Duck myDuck=new Duck();
        myDuck.setAge(3);
        System.out.println(myDuck.getAge());
        myDuck.setColor("grey");
        System.out.println(myDuck.getColor());

        Cat myCat=new Cat();
        myCat.setEyeColor("blue");
        System.out.println(myCat.getEyeColor());

        CatFood myCatFood=new CatFood();
        myCatFood.setFoodName("cat food");
        System.out.println(myCatFood.getFoodName());

    }

}
