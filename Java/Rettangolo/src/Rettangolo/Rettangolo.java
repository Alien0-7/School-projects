/*
 *
 * Elia Morari 3AI 24/10/23
 *
 * calcolo del perimetro e dell'area di un rettangolo
 *
 *
 */

package Rettangolo;

import java.util.Scanner;

public class Rettangolo {

    public static void main(String[] args) {


        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserire il valore della base del rettangolo:");

        double base = 0, altezza = 0; // Dichiarazione multipla dello stesso tipo di variabili
        base = tastiera.nextDouble();
        while (base <= 0 ) {
            System.out.println("Valore non valido!");
            System.out.println("Reinserie il valore");
            base = tastiera.nextDouble();
        }

        System.out.println("Inserire il valore dell'altezza del rettangolo:");
        altezza = tastiera.nextDouble();
        while (altezza <= 0 ) {
            System.out.println("Valore non valido!");
            System.out.println("Reinserie il valore");
            altezza = tastiera.nextDouble();
        }


        double area = altezza * base;
        double perimetro = altezza * 2 + base * 2;

        System.out.println("La base è " + base);
        System.out.println("L'altezza è " + altezza);
        System.out.println("L'area è " + area);
        System.out.println("Il prerimetro è " + perimetro);

        if (area > 10) {
            //operazioni vere
            System.out.println("Rettangolo grande");

        } else {
            //operazioni false
            System.out.println("Rettangolo piccolo");
        }

    }
    //Indentare = usare le parentesi graffe e gli spazi per visualizzare meglio i blocchi di operazioni

    /*
     * strutture condizionali annidate
     * if (condizione1) {
     * 	operazioni
     * 		if(condizione2) {
     * 		operazioni
     * 		}
     * operazioni
     * }
     *
     *
     *
     */


}
