package com.company.lab6;

import java.util.ArrayList;
import java.util.List;

public class LogicOp {

//Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru
// de tip Lista, iar celalalt un numar intreg. Sa se parcurga lista si sa afiseze, pe rand,
// toate valorile din lista, fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.

    public void printListFromNumber(List<Integer> myList, int number) {
        for (int i = number; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

//Scrieti o metoda Java, care sa primeasca
// parametru o Lista, si sa afiseze, pe rand, toate valorile din lista,
// dar invers(de la capat la inceput).

    public void printListBackwords(List<Integer> myList) {
        System.out.print("Backwords list: ");
        for (int i = myList.size() - 1; i >= 0; i--) {
            System.out.print(myList.get(i));
        }

    }
//Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista
// de String-uri, unul de tip intreg, si unul de tip String. Metoda sa adauge parametrul de
// tip String in lista primita, iar parametrul de tip intreg reprezinta pozitia la care
// sa fie pus acel String.

    public List<String> addElement(List<String> myList, String element, int position) {
        myList.add(position, element);
        return myList;
    }

    //TEMA
//1. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate
// valorile din lista, fiecare pe rand nou.
    public void printList(List<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

//2. Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere,
// si celalalt un numar (real sau intreg). Metoda sa adauge numarul primit ca si parametru la final de lista.

    public List addNumberToList(List<Integer> myList, int number) {
        myList.add(number);
        return myList;
    }


    //3. Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista,
// iar celalalt un numar intreg. Sa se parcurga lista si sa afiseze, pe rand,
// toate valorile din lista, fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.

    public void printListFromGivenNumber(List<Integer> myList, int number) {
        for (int i = number; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

    //4. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile
// din lista, dar invers(de la capat la inceput).
    public void printListBackwords2(List<Integer> myList) {
        System.out.print("Backwords list: ");
        for (int i = myList.size()-1; i >=0; i--) {
            System.out.print(myList.get(i)+" ");
        }
    }

//5. Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri,
// unul de tip intreg, si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita,
// iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.

    public List<String> addElementToList(List<String> myList, String element, int position) {
        myList.add(position, element);
        return myList;
    }

//6. Scrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista, iar metoda
// sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.

    public List addElementOnFirstPosition(List<String> myList, String element) {
        myList.add(0, element);
        return myList;
    }
//7. Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista, si pe ce
// ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).

    public void showListDescription(List<Integer> myList){
        for (int i=0; i<myList.size();i++){
            System.out.print("Pe pozitia "+i);
            System.out.print(" valoarea este "+myList.get(i));
            System.out.println();
        }
    }
//8. Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.

    public int printLowestNumberFromList(List<Integer> myList){
        int lowest=myList.get(0);
        for(int i=0; i<myList.size();i++){
            if (myList.get(i)<lowest){
                lowest=myList.get(i);
            }
        }
        System.out.print("Lowest number from list is: ");
        return lowest;
    }

//Tema optionala

//Scrieti o metoda Java care sa schimbe pozitia a doua elemente intr-o Lista

    public List changeTwoElementsFromList(List<Integer>myList,int index1,int index2){
        int change=0;
        change=myList.get(index1);
        myList.set(index1,myList.get(index2));
        myList.set(index2,change);

        return myList;
    }

//Scrieti o metoda Java care sa primeasca o Lista si sa returneze o alta lista, care
// sa contina doar numerele pare din lista primita.

    public List printEvenNumbersList(List<Integer> myList){
        List<Integer> myEvenNumbersList=new ArrayList<>();
        for (int i=0;i<myList.size();i++){
            if(myList.get(i)%2==0){
                myEvenNumbersList.add(myList.get(i));
            }
        }
        return myEvenNumbersList;
    }

//Scrieti o metoda Java care sa primeasca parametru o Lista nesortata, si sa returneze
// Lista sortata crescator. Atentie, sortarea sa se faca
// programatic(adica logica sa fie scrisa de voi), si nu folosit librarie externa, precum Collection.sort().

    public List printListinAscendentOrder(List<Integer> myList){
        int extra=0;

        for(int i=0;i<myList.size()-1;i++){
            for(int j=i+1;j<myList.size();j++)
                if(myList.get(i)>myList.get(j)){
                    extra=myList.get(i);
                    myList.set(i,myList.get(j));
                    myList.set(j,extra);
                }
            }

        return myList;
    }

}
