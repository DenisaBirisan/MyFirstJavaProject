package com.company.lab4;

public class LogicOp {

    //Write a java program to count backwards from a given number to a lower given number

    public void printBackwords(int firstNumber, int secondNumber) {
        for (int i = firstNumber; i >= secondNumber; i--) {
            System.out.println(i);
        }
    }


//1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
// Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100,
// pornind de la numarul primit ca si parametru.
// Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.


    public void printNumbers(int first) {
        for (int i = first; i <= 100; i++) {
            System.out.println(i);
        }
    }

//2.Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
// Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
// pornind de la numarul primit ca si parametru.
// Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.


    public void printNumbersBackwords(int first) {
        for (int i = first; i >= -100; i--) {
            System.out.println(i);
        }
    }


//3.Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
// Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul
// parametru primit, pana la cel de-al doilea
// (ex: daca int x e primul parametru iar int y  este cel de-al doilea,
// numaratoarea sa se faca de la x, la y.


    public void printNumberToNumber(int first, int second) {
        if (first < second) {
            for (int i = first; i <= second; i++)
                System.out.println(i);
        } else {
            for (int i = first; i >= second; i--) {
                System.out.println(i);
            }
        }

    }

//4.Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
// Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o
// numaratoare crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru iar
// int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).

    public void printAscendent(int first, int second) {
        if (first < second) {
            for (int i = first; i <= second; i++)
                System.out.println(i);
        } else {
            for (int i = second; i <= first; i++) {
                System.out.println(i);
            }
        }

    }

//5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

    public void printEven() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

//6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

    public void printOdd() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

//7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
// Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si
// parametru, iar la final sa returneze rezultatul.


    public int printSum(int first) {
        int sum = 0;
        for (int i = first; i <= 100; i++) {
            sum = i + sum;
        }
        return sum;
    }


//8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
// Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
// si sa calculeze media numerelor. La final, metoda sa returneze media.

    public double printAvarage(int number) {
        double sum = 0;
        int no = 0;
        for (int i = number; i <= 100; i++) {
            sum = i + sum;
            no = no + 1;
        }
        return sum / no;
    }

//9. Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar...

    public void printStars() {
        int row = 7;
        for (int i = 1; i <= row; i ++) {
            for (int star=row; star >= i; star--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


}













