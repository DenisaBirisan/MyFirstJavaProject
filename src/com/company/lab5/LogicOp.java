package com.company.lab5;

public class LogicOp {

//2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii,
// valorile de la 1 la 100. Sa se afiseze progresul in consola pe tot parcursul.

    public int[] populateArraywithNumbers() {
        int array[] = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

//3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol,
// si sa il returneze populat cu toate valorile pare de la 1 la 100.

    public int[] populateArraywithEvenNumbers(int array[]) {
        int position = 0;
        for (int i = 1; i <= 100; i++) {
            if ((i + 1) % 2 == 0) {
                array[position] = i + 1;
                position++;
            }
        }
        return array;
    }

//4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.
// Metoda sa calculeze si sa returneze media numerelor din array.

    public double calculateAvarage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum / array.length;
    }

//5. Creati o metoda care sa primeasca un parametru de tip array de string-uri,
// populat cu valori, si un parametru de tip String. Metoda sa verifice daca
// valoarea string-ului primit se regaseste in array-ul primit,
// iar daca da sa returneze true iar daca nu, sa returneze false.

    public boolean verifyStringElement(String[] array, String element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }


//6. Creati o metoda care sa primeasca un parametru de tip array de numere,
// populat cu valori, si un parametru de tip numar. Metoda sa verifice daca numarul primit se afla
// in array-ul primit, si daca da, atunci sa returneze pozitia pe care se afla numarul.

    public int verifyNumberInArray(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }


//7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array...

    public void printGrila() {
        String[] array = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};
        for (int rows = 1; rows <= 10; rows++) {
            for (int i = 0; i < 10; i++) {
                System.out.print(array[i]);
            }
            System.out.println();
        }
    }

//8. Creati o metoda care sa primeasca un parametru de tip array de numere,
// populat cu valori, si un parametru de tip numar. Metoda sa verifice daca numarul
// exista in array, si daca da, sa returneze array-ul primit, fara acel numar.

    public void printArrayWithoutNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                System.out.print(array[i] + ", ");
            }
        }
    }

//9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.

    public int printSecondLowestNumber(int[] array) {
        int lowest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < lowest) {
                lowest = array[i];
            }

        }
        int secondLowest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != lowest && array[i] < secondLowest) {
                secondLowest = array[i];
            }
        }
        return secondLowest;
    }


//10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.
// Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.

    public void copieNumbersInOtherArray(int[] array, int[] emptyArray) {
        for (int i = 0; i < array.length; i++) {
            emptyArray[i] = array[i];
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(emptyArray[j] + " ");
        }
    }

//Tema optionala

//1. Creati o metoda care insereze un element pe o pozitie specifica intr-un array.

    public void insertElementInArray(int[] array, int element, int position) {
        for (int i = 0; i < array.length; i++) {
            if (i == position) {
                array[i] = element;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

//2. Creati o metoda care sa gaseasca cel mai mare si cel mai mic numar dintr-un array.

    public void findMaxMinFromArray(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Numarul minim din sir este: " + min);
        System.out.println("Numarul maxim din sir este: " + max);
    }

//3. Creati o metoda care sa inverseze valorile unui array de int-uri.

    public int[] reverseArray(int[] array) {
        int j = array[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = j;
            j--;
        }
        return array;
    }

//4. Creati o metoda care sa gaseasca toate valorile duplicate dintr-un array.


    public void printDuplicateValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - i; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }

    //5. Creati o metoda care sa gaseasca toate elementele comune intre doua array-uri (array de String).

    public void printCommonValues(String[] firstArray, String[] secondArray) {
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    System.out.print(firstArray[i] + " ");
                }
            }
        }
    }


//6. Creati o metoda care sa primeasca un array de numere ne-ordonat, si sa il returneze ordonat crescator.

    public int[] rearrangeArray(int[] array) {
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                    j = i + 1;
                }
            }
        }
        return array;
    }
}


    //  public void rearrangeArray(int[]array){
    //    int j=1;
    //  int x=0;
    //for (int i=0;i<array.length;i++){
    //  if(array[i]>array[j]){
    //    x=array[i];
    //  array[i]=array[j];
    //array[j]=x;
    //j=i+1;
    // }
    //System.out.print(array[i]+" ");
    //}








