package com.company.lab4;

import java.io.OutputStream;

public class Lab4 {
    public static void main(String[] args) {
        LogicOp myLogic = new LogicOp();

        myLogic.printNumbersWhile(90);
        myLogic.printNumbersBackwordsWhile(-95);
        myLogic.printNumbertoNumberWhile(5,10);
        myLogic.printAscendentWhile(1,5);
        myLogic.printEvenWhile();
        myLogic.printOddWhile();
        myLogic.printAvarageWhile();
        System.out.println(myLogic.printDivisibleAvarage(5,30));
        myLogic.printFibonacci();
        myLogic.printCozaLozaWoza();





    }


}
