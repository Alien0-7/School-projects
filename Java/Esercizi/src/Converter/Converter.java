/*
 *
 * Elia Morari 3AI 24/10/23
 *
 * Convertitore di numeri da una base dell'input ad un'altra base dell'input
 *
 *
 */

package Converter;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Variables declaretion
        int firstBase, finalBase;
        double n;
        String nInput;
        boolean nValid = false;

        //First try

        System.out.print("Inserisci il numero da convertire: ");
        nInput = keyboard.next();

        try {
            n = Integer.parseInt(nInput);
            nValid = true;

            //if the input number isn't a double nValid is false

        } catch (NumberFormatException e) {
            System.out.println("Il numero inserito non è valido!");
        }

        //Second try, third try etc.

        while (!nValid) {
            System.out.print("Reinserire il numero da convertire: ");
            nInput = keyboard.next();

            try {
                n = Integer.parseInt(nInput);
                nValid = true;

                //if the input number isn't a double nValid is false

            } catch (NumberFormatException e) {
                System.out.println("Il numero inserito non è valido!");
            }
        }



        //TODO Chiedere la base 1(+ controllo) e la base 2(+ controllo)
        //TODO Se il numero è integer allora fai i calcoli normali se no fai anche la parte decimale

    }
}
