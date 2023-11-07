/*
 *
 * Elia Morari 3AI 24/10/23
 *
 * Convertitore di numeri da una base dell'input ad un'altra base dell'input
 *
 *
 */

package Converter;

import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class Converter {

    public static void main(String[] args) {
        //*************************<-->  VARIABLES DECLARATION  <-->*************************\\

        Scanner keyboard = new Scanner(System.in);
        int firstBase = 1, finalBase = 1;
        double n = 0, finalNumberDouble = 0;
        String nInput, firstBaseInput, finalBaseInput, numberType = null;
        boolean nValid = false, firstBaseValid = false, finalBaseValid = false;
        long finalNumberInt = 0;

        //*************************<-->  NUMBER INPUT  <-->*************************\\

        System.out.print("Inserisci il numero da convertire: ");
        nInput = keyboard.next();

        while (!nValid) {
                if (nInput.matches("\\d+")) {
                    numberType = "Int";
                    nValid = true;
                    n = Integer.parseInt(nInput);
                } else if (nInput.matches("[-+]?\\d*\\.?\\d+")) {
                    numberType = "Double";
                    nValid = true;
                    n = Double.parseDouble(nInput);
                } else {
                    System.out.print("Il numero inserito non è valido!\nReinserisci il numero da convertire: ");
                    nInput = keyboard.next();
                }
        }

        //*************************<-->  BASE1 INPUT  <-->*************************\\

        System.out.print("Inserisci la base di partenza: ");
        firstBaseInput = keyboard.next();

        try {
            firstBase = Integer.parseInt(firstBaseInput);
            firstBaseValid = true;

            //if the input number isn't a double the boolean value is false

        } catch (NumberFormatException e) {
            System.out.println("Il numero inserito non è valido!");
        }

        while (!firstBaseValid) {
            System.out.print("Reinserire la base di partenza: ");
            firstBaseInput = keyboard.next();

            try {
                firstBase = Integer.parseInt(firstBaseInput);
                firstBaseValid = true;

                //if the input number isn't a double the boolean value is false

            } catch (NumberFormatException e) {
                System.out.println("Il numero inserito non è valido!");
            }
        }

        //*************************<-->  BASE2 INPUT  <-->*************************\\

        System.out.print("Inserisci la base di destinazione: ");
        finalBaseInput = keyboard.next();

        try {
            finalBase = Integer.parseInt(finalBaseInput);
            finalBaseValid = true;

            //if the input number isn't a double the boolean value is false

        } catch (NumberFormatException e) {
            System.out.println("Il numero inserito non è valido!");
        }

        while (!finalBaseValid) {
            System.out.print("Reinserire la base di destinazione: ");
            finalBaseInput = keyboard.next();

            try {
                finalBase = Integer.parseInt(finalBaseInput);
                finalBaseValid = true;

                //if the input number isn't a double the boolean value is false

            } catch (NumberFormatException e) {
                System.out.println("Il numero inserito non è valido!");
            }
        }

        //*************************<-->  CALCULATION PHASE  <-->*************************\\

        switch (numberType) {
            case "Int":
            //*************************<-->  NON DECIMAL NUMBER  <-->*************************\\

            if (firstBase == 10) {

                finalNumberInt = convertFromBase10((int) n, finalBase);

            } else if (firstBase > finalBase) {

                finalNumberInt = convertFromBase10(convertToBase10((int) n, firstBase), finalBase);

            } else {

                finalNumberInt = convertFromBase10(convertToBase10((int) n, firstBase), finalBase);

            }
            case "Double":
            //*************************<-->  DECIMAL NUMBER  <-->*************************\\
            if (firstBase == 10) {

                finalNumberDouble = convertToBase10((int) n, finalBase);

            } else if (firstBase > finalBase) {

                finalNumberDouble = convertFromBase10(convertToBase10((int) n, firstBase), finalBase);

            } else {

                finalNumberDouble = convertFromBase10(convertToBase10((int) n, firstBase), finalBase);

            }


            //TODO dividere il numero in parte decimale e in parte intera
            //TODO convertire il numero

            finalNumberDouble = convertToBase10((int) n, finalBase);

        }

        System.out.println("il numero: " + n + " in base: " + firstBase + " convertito in base: " + finalBase + " è: " + finalNumberInt);
    }

    private static long convertFromBase10 (int wholeSection, int finalBase){
        int result, rest;
        String sum = "";

        result = wholeSection / finalBase;
        do {
            rest = result % finalBase;
            result = result / finalBase;

            sum = rest + sum; // concatenazione

        } while (result > 0);

        return Long.parseLong(sum);
    }
    private static int convertToBase10 (int wholeSection,int firstBase){

        String num = String.valueOf(wholeSection);
        String array[] = num.split("");
        double sum = 0;

        Collections.reverse(Arrays.asList(array)); //reverse array

        for (int i = 0; i < array.length; i++){
            sum = (Integer.parseInt(array[i]) * Math.pow(firstBase, i)) + sum ;
        }
        return (int) sum;

    }

}
