package com.company.lab7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromKeyBoard {


    public int readInt() {
        int x = 0;
        boolean read = true;
        while (read == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu o valoare");
            try {
                x = scanner.nextInt();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect");
            }
        }
        return x;
    }

    public float readFloat() {
        float x = 0;
        boolean read = true;
        while (read == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu o valoare");
            try {
                x = scanner.nextFloat();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect");
            }
        }
        return x;
    }

    public String readString() {
        String x = "a";
        boolean read = true;
        while (read == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu o valoare");
            try {
                x = scanner.next();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect");
            }
        }
        return x;
    }

    public Double readDouble() {
        double x = 0;
        boolean read = true;
        while (read == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu o valoare");
            try {
                x = scanner.nextDouble();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect");
            }
        }
        return x;
    }

    public boolean readBoolean() {
        boolean x = true;
        boolean read = true;
        while (read == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu o valoare");
            try {
                x = scanner.nextBoolean();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect");
            }
        }
        return x;
    }

    public byte readByte() {
        byte x = 0;
        boolean read = true;
        while (read == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu o valoare");
            try {
                x = scanner.nextByte();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect");
            }
        }
        return x;
    }

    //TEMA


//Ex. 1 si ex.2

    public int readNumberInt() {
        System.out.println("Introduceti numarul: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        return x;
    }

    public boolean readNumberBoolean() {
        System.out.println("Introduceti numarul: ");
        Scanner scanner = new Scanner(System.in);
        boolean x = scanner.nextBoolean();
        return x;
    }

    public String readStringElement() {
        System.out.println("Introduceti caracterul: ");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        return x;
    }

    public byte readByteNumber() {
        System.out.println("Introduceti caracterul: ");
        Scanner scanner = new Scanner(System.in);
        byte x = scanner.nextByte();
        return x;
    }

    public float readFloatNumber() {
        System.out.println("Introduceti numarul: ");
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        return x;
    }

    public long readLong() {
        System.out.println("Introduceti numarul");
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        return x;
    }


//Ex 3. In clasa Read, creati o metoda care sa returneze un array de numere
// populat de la tastatura. Metoda sa primeasca ca si parametru un numar, care reprezinta cate pozitii are.

    public int[] populateArray(int index) {
        int[] array = new int[index];
        for (int i = 0; i < index; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti valoarea: ");
            array[i] = scanner.nextInt();


        }
        return array;

    }

    //Ex 4.  In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura.
// Metoda nu v-a primii parametru lungimea. In rezolvarea ei trebuie folosit try-catch.
// (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar, cand nu mai e numar, sa se intrerupa citirea)

    public int[] populateArrayWithExceptions(int index) {
        int[] array = new int[index];
        for (int i = 0; i < index; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti valoarea: ");
            try {
                array[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect");
                i=i-1;
            }
        }
        return array;

    }








}
