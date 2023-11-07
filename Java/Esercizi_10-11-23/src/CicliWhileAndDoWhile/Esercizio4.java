/*
 * Nome   : Elia Morari
 * Classe : 3AI
 * Data   : 07/11/23
 *
 * Repository : https://github.com/Alien0-7/School-projects/tree/main/Java/Esercizi_10-11-23
 *
 * Descrizione:
 * Inserire l’età di una persona: controllare che l’età inserita sia compresa tra 1 e 120… altrimenti
 * re-inserirla. Poi determinare se la persona è minorenne (età < 18), maggiorenne (età >= 18),
 * “terza età” (età >= 80), “centenario” (età >= 100).
 *
 */
package CicliWhileAndDoWhile;

import java.util.Scanner;

public class Esercizio4 {

    public static void main(String[] args) {
        int eta;
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci l'età: ");
        eta = scan.nextInt();

        while (eta < 1 || eta > 120) {
            System.out.print("l'età inserita invalida!\nReiscerisci l'età: ");
            eta = scan.nextInt();
        }

        if (eta >= 100) {
            System.out.println("Centenario");
        } else if (eta >= 80) {
            System.out.println("Terza età");
        } else if (eta >= 18){
            System.out.println("Maggiorenne");
        } else {
            System.out.println("Minorenne");
        }
    }
}
