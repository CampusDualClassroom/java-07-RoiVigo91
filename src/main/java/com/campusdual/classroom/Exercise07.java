package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        positionInAList(1);
        positionInAList(11);
        sumFirstNaturalNumbers(5);
        sumFirstNaturalNumbers(-5);
        showFirstNaturalNumbers(5);
        showFirstNaturalNumbers(-5);

    }



    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        List<Integer> numeroList = new ArrayList<>();
        for (int i = 10; i >= 1; i--) {
            numeroList.add(i);

        }
        if (numeroList.contains(num)) {
            int posicion = numeroList.indexOf(num);
            System.out.println("El elemento " + num + " se encuentra en la posición: " + posicion);
        } else {
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        }
    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        if (num <= 0){
            System.out.println("Error! Introduzca un numero entero positivo");
            return;
        }

        StringBuilder builder = new StringBuilder("Suma de los primeros " + num + " numeros naturales: ");

        int suma = 0;
        for(int i = 1; i <= num;i++){
            suma += i;
            builder.append(i);
            if (i< num){
                builder.append("+");
            }
        }
        System.out.println(builder + " = " + suma);

    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        if ( num < 0 ){
            System.out.println("Error! Introducir un numero positivo");
            return;

        }

        StringBuilder builder = new StringBuilder("Los primeros naturales de " + num + " son: ");


        for(int i = 1; i <= num;i++){
            builder.append(i);
            if (i< num){
                builder.append(" ");
            }
        }
        System.out.println(builder);

    }

}
