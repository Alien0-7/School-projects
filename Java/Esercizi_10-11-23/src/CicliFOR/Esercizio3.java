/*
 * Nome   : Elia Morari
 * Classe : 3AI
 * Data   : 06/11/23
 *
 * Repository : https://github.com/Alien0-7/School-projects/tree/main/Java/Esercizi_10-11-23
 *
 * Descrizione:
 * Leggere dall’input 10 numeri interi
 * calcolare la media di tutti i numeri inseriti.
 *
 */

package CicliFOR;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        double media = 0;

        for (int i =1; i <=10; i++ ){

            System.out.print("Inserisci il "+ i + "°" + " numero: ");
            n = scan.nextInt();

            media = n + media;
        }

        media = media /10;

        System.out.println("la media dei numeri è: " + media);
    }
}
