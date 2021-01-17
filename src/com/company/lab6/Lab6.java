package com.company.lab6;

import java.util.ArrayList;
import java.util.List;

public class Lab6 {
    public static void main(String[] args) {

        List<Integer> myList=new ArrayList<>();
        myList.add(7);
        myList.add(1);
        myList.add(8);
        myList.add(3);
        myList.add(2);
        myList.add(5);

    LogicOp myLogic=new LogicOp();
    myLogic.printListFromNumber(myList,2);
    myLogic.printListBackwords(myList);

        List<String>myStringList=new ArrayList<>();
        myStringList.add("a");
        myStringList.add("b");
        myStringList.add("c");
        myStringList.add("d");
        myStringList.add("e");


    System.out.println(myLogic.addElement(myStringList,"z",3));
    myLogic.printList(myList);
    System.out.println(myLogic.addNumberToList(myList,9));
    myLogic.printListBackwords2(myList);
    System.out.println(myLogic.addElementToList(myStringList,"yes",1));
    System.out.println(myLogic.addElementOnFirstPosition(myStringList,"first"));
    myLogic.showListDescription(myList);
    System.out.println(myLogic.printLowestNumberFromList(myList));

    System.out.println(myLogic.changeTwoElementsFromList(myList,0,1));
    System.out.println(myLogic.printEvenNumbersList(myList));
        List<Integer> mySecondList=new ArrayList<>();
        mySecondList.add(7);
        mySecondList.add(1);
        mySecondList.add(8);
        mySecondList.add(3);
        mySecondList.add(2);
        mySecondList.add(5);

    System.out.println(myLogic.printListinAscendentOrder(mySecondList));


    }

}
