package com.company.lab7;

import java.util.InputMismatchException;

public class LogicOp {

    // Ex 5. In clasa LogicalOp, creati o metoda care sa primeasca un array de numere ca si parametru, si un numar.
// Fara a folosi conditii, si folosind un try-catch, afisati valoarea de pe pozitia numarului primit, iar daca
// valoarea numarului este mai mare decat numarul de pozitii din array, afisati textul: "Inside catch, number too large".

    public void showArrayNumberWithTryCatch(int[] array, int index) {
        try {
            System.out.println(array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside catch, number too large");
        }
    }

// Ex 6. In clasa LogicalOp, creati o metoda  'wait()'. Metoda sa nu returneze nimic, dar
// sa primeasca un parametru de tip int. In interiorul ei, tratati metoda Thread.sleep(),
// astfel incat metoda noastra sa primeasca valoarea in secunde, cat sa astepte. Ex: wait(5) -> asteapta 5 secunde.

    public void waiT(int x) throws InterruptedException {
        Thread.sleep(x);
    }

//Nu prea inteleg ce trebuie sa fac la exercitiul alcesta. Nu inteleg cerinta :D

}
