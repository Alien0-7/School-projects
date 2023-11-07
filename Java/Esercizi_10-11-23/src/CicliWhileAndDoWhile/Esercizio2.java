/*
 * Nome   : Elia Morari
 * Classe : 3AI
 * Data   : 07/11/23
 *
 * Repository : https://github.com/Alien0-7/School-projects/tree/main/Java/Esercizi_10-11-23
 *
 * Descrizione:
 * Inserire dall’input un numero intero compreso tra 5 e 15 (ripetere l’inserimento finchè il
 * numero non è compreso tra 5 e 15). Successivamente visualizzare il suo quadrato.
 *
 */
package CicliWhileAndDoWhile;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args){
        int n;
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        n = scan.nextInt();

        while (n < 5  || n > 15) {
            System.out.print("Numero inserito invalido!\nReiscerisci il numero: ");
            n = scan.nextInt();
        }

        System.out.println("Il quadrato di " + n + " è " + Math.pow(n, 2));
    }
}
