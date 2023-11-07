/*
 * Nome   : Elia Morari
 * Classe : 3AI
 * Data   : 06/11/23
 *
 * Repository : https://github.com/Alien0-7/School-projects/tree/main/Java/Esercizi_10-11-23
 *
 * Descrizione:
 * Scrivere un programma che richieda dall’input un numero intero n compreso tra 1 e 10 e
 * visualizzi le prime n potenze di 2 (2n).
 *
 * Esempio:
 * n = 8  2 4 8 16 32 64 128 256
 *
 */
package CicliFOR;

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.print("Inserisci quante potenze di due vuoi visulizzare: ");
        n= scan.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("La " + i + "° potenza di 2 è: " + Math.pow(2 , i));
        }
    }
}
