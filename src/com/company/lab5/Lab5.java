package com.company.lab5;

public class Lab5 {
    public static void main(String[] args) {
        LogicOp myLogic=new LogicOp();
        int[] myArray=myLogic.populateArraywithNumbers();
        myLogic.printArray(myArray);

        int[] array=new int[50];
        int[]myArray2=myLogic.populateArraywithEvenNumbers(array);
        myLogic.printArray(myArray2);
        int[] myArray3={2,4,6};
        System.out.println(myLogic.calculateAvarage(myArray3));
        String[] myArray4={"a","b","c","d","e","f","g"};
        System.out.println(myLogic.verifyStringElement(myArray4,"i"));
        int[] myArray5={1,2,3,4,5,6,7,8,9,10};
        System.out.println(myLogic.verifyNumberInArray(myArray5,5));
        myLogic.printGrila();
        myLogic.printArrayWithoutNumber(myArray5,5);
        System.out.println();
        int[] myArray6={3,2,5,6};
        System.out.println(myLogic.printSecondLowestNumber(myArray6));
        int[] emptyArray=new int[10];
        myLogic.copieNumbersInOtherArray(myArray5,emptyArray);
        System.out.println();
        myLogic.insertElementInArray(myArray6,0,1);
        System.out.println();
        myLogic.findMaxMinFromArray(myArray6);
        int[] myArrayExample={1,2,3,4,5};
        int[] myArray8= myLogic.reverseArray(myArrayExample);
        myLogic.printArray(myArray8);
        System.out.println();
        int[]myDublicateArray={1,2,3,4,3,2,5};
        myLogic.printDuplicateValues(myDublicateArray);
        System.out.println();
        String []firstArray={"a","b","c","d","e"};
        String[]secondArray={"a","c","s","l"};
        myLogic.printCommonValues(firstArray,secondArray);
        System.out.println();
        int[]myArrayToArrange={2,5,4,1,3};
        int[] myLastArray=myLogic.rearrangeArray(myArrayToArrange);
        myLogic.printArray(myLastArray);








    }


}
