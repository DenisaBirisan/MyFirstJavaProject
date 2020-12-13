package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        printMyName();
        int res=sum(5,5);
        System.out.println(res);
        double result=div(10,3);
        System.out.println(result);
        res=sumtimes(-5,8,6);
        System.out.println(res);
        res=summodulo(55,9,9);
        System.out.println(res);
        result=a(20,-3,5,8);
        System.out.println(result);
        result=b(5,15,3,2,8,3);
        System.out.println(result);
        System.out.println(b2());
        System.out.println("Rezultatul adunarii este: " + adunare(2,3));
        System.out.println("Rezultatul scaderii este: " + scadere(1,3));
        System.out.println("Rezultatul inmultirii este: " + inmultire(4,3));
        System.out.println("Rezultatul impartirii este: " + impartire(10,3));

        printFace();
        prinJava();

        res=rest(10,7);
        System.out.println("Restul impartirii este:" + res);

        result=celsius(70);
        System.out.println("Grade in Celsius: " + result);

        result=meters(500.3);
        System.out.println(result + " metri");

        result=viteza(1609,10,10,10);
        System.out.println(result);







    }

    static void printMyName(){
        System.out.println("Hello!\nDenisa");
    }

    static int sum(int firstNumber, int secondNumber){
        return(firstNumber + secondNumber);
    }

    static double div(double firstNumber, double secondNumber){
        return (firstNumber / secondNumber);
    }

    static int sumtimes(int firstNumber, int secondNumber, int thirdNumber){
        return(firstNumber+secondNumber*thirdNumber);
    }

    static int summodulo(int firstNumber, int secondNumber, int thirdNumber){
        return((firstNumber+secondNumber)%thirdNumber);
    }

    static double a(double firstNumber, double secondNumber, double thirdNumber, double fourthNumber){
        return(firstNumber+(secondNumber*thirdNumber)/fourthNumber);
    }

    static double b(double firstNumber, double secondNumber, double thirdNumber, double fourthNumber, double fifthNumber, double sixthNumber){
        return(firstNumber+(secondNumber/thirdNumber)*fourthNumber-fifthNumber%sixthNumber);
    }

    static double b2(){
        return(5 + 15 / 3 * 2 - 8 % 3 );
    }

    public static int adunare(int primulNumar, int alDoileaNumar) {

        int rezultat = primulNumar + alDoileaNumar;

        return rezultat;
    }
    public static int scadere(int primulNumar, int alDoileaNumar) {

        int rezultat = primulNumar - alDoileaNumar;

        return rezultat;
    }
    public static int inmultire(int primulNumar, int alDoileaNumar) {

        int rezultat = primulNumar*alDoileaNumar;

        return rezultat;
    }
    public static double impartire(double primulNumar, double alDoileaNumar) {
        double rezultat = primulNumar/alDoileaNumar;
        return rezultat;
    }

    static void printFace(){
        System.out.println(" +\"\"\"\"\"+ \n" +
                "[| o o |]\n" +
                " |  ^  |\n " +
                "| '-' |\n " +
                "+-----+\n ");

    }

    static void prinJava(){
        System.out.println("   J     a    v     v   a\n"+
                           "   J    a a    v   v   a a\n"+
                           "J  J   aaaaa    v v   aaaaa\n" +
                           " JJ   a     a    v   a     a");
    }


    static int rest(int primulNumar, int alDoileaNumar){
        return(primulNumar%alDoileaNumar);
    }

    static double celsius(double primulNumar){
        double result=((primulNumar -32)*5/9);
        return result;
    }

    static double meters(double primulNumar){
        return (primulNumar*0.0254);
    }

    static double viteza (double metri, double ore, double minute, double secunde){
        double a=metri/secunde;
        double b=((metri/1000)/ore);
        double c=((metri/1609)/ore);
        System.out.println(a);
        System.out.println(b);
        return (c);


    }

    }


