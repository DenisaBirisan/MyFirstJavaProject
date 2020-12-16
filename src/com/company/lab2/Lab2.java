package com.company.lab2;

public class Lab2 {
    public static void main(String[] args) {

        int result=sum(3,3);
        System.out.println(result);

        result=sub(10,3);
        System.out.println(result);

        result=div(10,5);
        System.out.println(result);

        result=times(3,5);
        System.out.println(result);

        result=rest(20,3);
        System.out.println(result);

        double result2=real(5,4);
        System.out.println(result2);

        result2=bigsum(2,3,4.3);
        System.out.println(result2);

        int d=dif(3,5);
        System.out.println(d);

        double impresult=imp(10,2,4);
        System.out.println(impresult);

        double aresult=a(10,3,4);
        System.out.println(aresult);






    }
    static int sum(int firstNumber, int secondNumber){

        return(firstNumber + secondNumber);
    }

    static int sub(int firstNumber, int secondNumber) {

        return (firstNumber - secondNumber);
    }

    static int div(int firstNumber, int secondNumber) {

        return (firstNumber / secondNumber);
    }

    static int times(int firstNumber, int secondNumber){

        return( firstNumber*secondNumber);
    }

    static int rest(int firstNumber, int secondNumber){

        return(firstNumber%secondNumber);
    }

    static double real(double firstNumber, double secondNumber){

        return(firstNumber/secondNumber);
    }

    static double bigsum(int firstNumber, int secondNumber,
                         double thirdNumber){
        return(firstNumber+secondNumber+thirdNumber);
    }

    static int dif(int firstNumber, int secondNumber){
        return(firstNumber-secondNumber);
    }

    static double imp(double firstNumber, double secondNumber, double thirdNumber){
        return(firstNumber/secondNumber/thirdNumber);
    }

    static double a(double firstNumber, double secondNumber, double thirdNumber){
        return(firstNumber/secondNumber+thirdNumber);
    }




}
