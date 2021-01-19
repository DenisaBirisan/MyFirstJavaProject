package com.company.lab7;

public class Lab7 {
    public static void main(String[] args) throws InterruptedException {
        int[] myArray = {10, 20, 30, 40};
        ReadFromKeyBoard read = new ReadFromKeyBoard();
        //   int myInt = read.readInt();
        //   float myFloat=read.readFloat();
        //   boolean myBoolean=read.readBoolean();
        //   byte myByte= read.readByte();
        //    String myString=read.readString();
        //   System.out.println(myArray[myInt]);
        //   System.out.println(myArray[(int) myFloat]);
        //   System.out.println(myArray[Integer.parseInt(myString)]);
        //   System.out.println(myArray[myByte]);


        //    int[] array=read.populateArray(5);
        //    System.out.print("Sirul este: ");
        //    for(int i=0;i<array.length;i++){
        //       System.out.print(array[i]+" ");
        //    }
        //    System.out.println();
        //    System.out.println(read.readNumberInt());

       // int[] array2 = read.populateArrayWithExceptions(5);
       // System.out.print("Sirul este: ");
       // for (int i = 0; i < array2.length; i++) {
        //    System.out.print(array2[i] + " ");

      //  int[] array3={1,2,3,4,5,6,7};
        LogicOp myLogic=new LogicOp();
      //  myLogic.showArrayNumberWithTryCatch(array3,9);
        myLogic.waiT(5);


        }
    }
