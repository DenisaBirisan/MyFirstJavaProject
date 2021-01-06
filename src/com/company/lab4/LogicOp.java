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
        for (int i = 1; i <= row; i++) {
            for (int star = row; star >= i; star--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


//While Loop
//1. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
// Metoda sa verifice numrul primit,si sa afiseze in consola o numaratoare pana la 100,
// pornind de la numarul primit ca si parametru.

    public void printNumbersWhile(int number) {
        do {
            System.out.println(number);
            number++;
        } while (number <= 100);
    }


//2. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
// Metoda sa verifice numrul primit si sa afiseze in consola o numaratoare pana
// la -100, pornind de la numarul primit ca si parametru.

    public void printNumbersBackwordsWhile(int number) {
        do {
            System.out.println(number);
            number--;
        } while (number >= -100);
    }

//3. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
// Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
// pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea,
// numaratoarea sa se faca de la x, la y.


    public void printNumbertoNumberWhile(int first, int second) {
        if (first < second) {
            do {
                System.out.println(first);
                first++;
            } while (first <= second);
        } else {
            do {
                System.out.println(first);
                first--;
            } while (first >= second);
        }
    }

//4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
// Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
// si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.(ex: daca int x
// e primul parametru iar int y este cel de-al doilea, daca x  este mai mare decat y,
// atunci numaratoarea sa fie de la y la x).

    public void printAscendentWhile(int first, int second) {
        if (first < second) {
            do {
                System.out.println(first);
                first++;
            } while (first <= second);
        } else {
            do {
                System.out.println(second);
                second++;
            } while (second <= first);
        }
    }

//5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

    public void printOddWhile() {
        int i = 1;
        do {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }
        while (i <= 100);

    }

//6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

    public void printEvenWhile() {
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
        while (i <= 100);

    }

    //7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899.
// Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
// Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval.

    public void printAvarageWhile() {
        int sum = 0;
        int count = 0;
        int i = 111;
        do {
            sum = sum + i;
            i++;
            count = count + 1;
        } while (i <= 8899);

        System.out.println("Suma numerelor este: " + sum);
        System.out.println("Media numerelor este: " + sum / count);


    }


//8. Creati o metoda care sa primeasca doi parametrii de tip numar,
// si sa returneze media numerelor divizibile cu 7, din acel interval.

    public double printDivisibleAvarage(int first, int second) {
        double sum = 0;
        double count = 0;
        do {
            if (first % 7 == 0) {
                sum = sum + first;
                count = count + 1;
            }
            first++;
        } while (first <= second);

        return sum / count;

    }

//9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.

    public void printFibonacci() {
        int first = 0;
        System.out.println(first);
        int second = 1;
        System.out.println(second);
        int sum = 0;
        int count = 0;
        do {
            sum = first + second;
            System.out.println(sum);
            first = second;
            second = sum;
            count++;
        } while (count <= 17);


    }

//10. Creati o metoda numita CozaLozaWoza.

    public void printCozaLozaWoza() {
        int first = 1;
        int count = 0;
        do {
            if (first % 3 == 0) {
                System.out.print("Coza ");
            } else if (first % 5 == 0) {
                System.out.print("Loza ");
            } else if (first % 7 == 0) {
                System.out.print("Woza ");
            } else if (first % 3 == 0 & first % 5 == 0) {
                System.out.println("CozaLoza");
            } else if (first % 3 == 0 & first % 7 == 0) {
                System.out.print("CozaWoza ");
            } else if (first % 5 == 0 & first % 7 == 0) {
                System.out.print("WozaLoza ");
            } else if (first % 3 == 0 & first % 5 == 0 & first % 7 == 0) {
                System.out.print("CozaWozaLoza ");
            } else {
                System.out.print(first);
            }
            first++;
            count++;
            if (count % 11 == 0) {
                System.out.println();
            }
        }
        while (first <= 110);

    }


}





















