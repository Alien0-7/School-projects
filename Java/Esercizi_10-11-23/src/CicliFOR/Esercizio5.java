/*
 * Nome   : Elia Morari
 * Classe : 3AI
 * Data   : 06/11/23
 *
 * Repository : https://github.com/Alien0-7/School-projects/tree/main/Java/Esercizi_10-11-23
 *
 * Descrizione:
 * Il quadrato di un numero n si può calcolare come somma dei primi n numeri dispari.
 *
 * Esempio:
 * n=4 n^2 = 4^2 = 1+3+5+7 = 16
 *
 */
package CicliFOR;

import java.util.Scanner;

public class Esercizio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, dispari = 0, q = 0;

        System.out.print("Inserisci la potenza del numero che vuoi visulizzare: ");
        num = scan.nextInt();

        for (int i = 1; num > dispari; i++){
            if (i % 2 != 0){
                q = i + q;
                dispari++;
            }
        }
        System.out.println("la potenza di " + num + " è: " + q);
    }
}
