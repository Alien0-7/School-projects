/*
 * Nome   : Elia Morari
 * Classe : 3AI
 * Data   : 07/11/23
 *
 * Repository : https://github.com/Alien0-7/School-projects/tree/main/Java/Esercizi_10-11-23
 *
 * Descrizione:
 * Inserire dall’input dei numeri interi finchè non si inserisce il numero 0 (zero).
 * Determinare quanti numeri positivi e negativi sono stati inseriti.
 *
 */
package CicliWhileAndDoWhile;

import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args){
        int n, pos = 0, neg = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        n = scan.nextInt();
        if (n < 0) {
            neg++;
        } else {
            if (n != 0){
                pos++;
            }
        }

        while (n != 0){
            System.out.print("Reinserisci un numero: ");
            n = scan.nextInt();

            if (n < 0) {
                neg++;
            } else {
                if (n != 0){
                    pos++;
                }
            }


        }

        System.out.println("Sono stati inseriti " + pos + " numeri positivi e " + neg + " numeri negativi");
    }
}
