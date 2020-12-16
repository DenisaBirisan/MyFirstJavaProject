package com.company.lab3;


import javax.swing.*;

//ex.3
public class LogicOp {
    public int checkBiggerNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }


    //ex.4
    public String verifyText(String text) {
        if (text.equals("FastTrackIt")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more.";
        }
    }

//ex.5
    public String veryfyTextAndNumber(String text, int number) {
        if (text.equals("FastTrackIT") && number <= 3) {
            return (text + ", " + number);
        } else if (!text.equals("FastTrackIT") && number >= 4) {
            return (number + ", " + text);
        } else
            return (" ");
    }

//ex.6


    public String verifyTextOr(int number){
        if (number>8 || number==6){
            return ("The amount of snow this winter was(cm): " + number );}
            else{
                return("The forecast snow is(cm): " + number);
            }
        }


//ex.7

    public String verifyTextAnd(int number){
        if (number>3 && number!=4){
            return ("The number is greater than 3 and not equal to 4");
        }else if (number==4){
            return ("The number is equal to 4");
        }else if (number < 3){
            return ("The number is lower than 3");
        }else
            return (" ");

    }

//ex.8

    public void showNumber(int number){
        switch (1) {
            case 1:
                System.out.print("The number is:");
            case 2:
                System.out.print(number);
            case 3:
                System.out.println("!");
                break;
        }
    }

// sau (ex.8, dar doar cu numere de la 1 la 10)

    public void showNumber2(int number){
        switch(number){
            case 1:
                System.out.println("The number is:1!");
                break;
            case 2:
                System.out.println("The number is:2!");
                break;
            case 3:
                System.out.println("The number is:3!");
                break;
            case 4:
                System.out.println("The number is:4!");
                break;
            case 5:
                System.out.println("The number is:5!");
                break;
            case 6:
                System.out.println("The number is:6!");
                break;
            case 7:
                System.out.println("The number is:7!");
                break;
            case 8:
                System.out.println("The number is:8!");
                break;
            case 9:
                System.out.println("The number is:9!");
                break;
            case 10:
                System.out.println("The number is:10!");
                break;
        }
    }

 //ex.9

    public String isNumberEven(int number){
        if (number%2==0) {
            return ("true");
        }else{
            return ("false");
        }
    }

//ex.10

    public String isEligibleToVote(int number){
        if (number>=18) {
            return ("true");
        }else{
            return("false");
        }
    }

//ex.11

    public int largestNumber(int a, int b, int c){
        if (a>b && a>c){
            return (a);}
            else if(b>a && b>c){
                return(b);}
            else if(c>a && c>b){
                return (c);}
            else
                return(-1);
        }
    }












