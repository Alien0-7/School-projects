/*
 * Nome   : Elia Morari
 * Classe : 3AI
 * Data   : 07/11/23
 *
 * Repository : https://github.com/Alien0-7/School-projects/tree/main/Java/Esercizi_10-11-23
 *
 * Descrizione:
 * Inserire dall’input il voto della verifica di informatica (un numero intero compreso tra 1 e 10,
 * ripetere l’inserimento finchè il numero non è corretto). Successivamente visualizzare: voto>=6
 * “Sufficiente” o voto = 5 “Insufficiente” o voto <5 “Gravemente insufficiente”.
 *
 */
package CicliWhileAndDoWhile;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        int voto;
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci il voto: ");
        voto = scan.nextInt();

        while (voto < 1  || voto > 10) {
            System.out.print("Voto inserito invalido!\nReiscerisci il numero: ");
            voto = scan.nextInt();
        }

        if (voto >= 6) {
            System.out.println("Sufficente");
        } else if (voto == 5) {
            System.out.println("Insufficente");
        } else {
            System.out.println("Gravemente insufficente");
        }

    }
}
