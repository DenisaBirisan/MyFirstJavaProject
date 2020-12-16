package com.company.lab3;

public class Lab3 {
    public static void main(String[] args) {
        Math myMath=new Math();
        System.out.println(myMath.sum(5,5));
        System.out.println(myMath.bigsum(1,2,3.5));
        System.out.println(myMath.a(2,2,3));
        System.out.println(myMath.dif(5,2));
        System.out.println(myMath.div(10,2));
        System.out.println(myMath.imp(5,3,2));
        System.out.println(myMath.real(10,3));
        System.out.println(myMath.rest(10,8));
        System.out.println(myMath.sub(4,2));
        System.out.println(myMath.times(2,3));


        LogicOp myLogicOp=new LogicOp();
        System.out.println(myLogicOp.checkBiggerNumber(1,3));

        System.out.println(myLogicOp.verifyText("FastTrackit"));

        System.out.println(myLogicOp.veryfyTextAndNumber("something else",4));

        System.out.println(myLogicOp.verifyTextOr(8));

        System.out.println(myLogicOp.verifyTextAnd(5));

        myLogicOp.showNumber(8);
        myLogicOp.showNumber2(5);

        System.out.println(myLogicOp.isNumberEven(3));

        System.out.println(myLogicOp.isEligibleToVote(17));

        System.out.println(myLogicOp.largestNumber(1,1,1));








    }
}
