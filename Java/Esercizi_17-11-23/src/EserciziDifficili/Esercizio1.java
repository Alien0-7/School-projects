/*
 * Nome   : Elia Morari
 * Classe : 3AI
 * Data   : 16/11/23
 *
 * Repository : https://github.com/Alien0-7/School-projects/tree/main/Java/Esercizi
 *
 * Descrizione:
 * Inserito dall'input il numero intero N, visualizzare i seguenti triangoli: es. per N = 4
 *
 *    *                1                1
 *    * *              2 2              2 3
 *    * * *            3 3 3            4 5 6
 *    * * * *          4 4 4 4          7 8 9 10
 */
package EserciziDifficili;

import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n,l=1, k = 1;

        System.out.print("Inserisci il numero: ");
        n = scan.nextInt();

        while (n<=0){
            System.out.print("Numero inserito non valido!\nReinserire il numero: ");
            n = scan.nextInt();
        }

        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= k; i++) {
                System.out.print("* ");
            }
            k++;
            System.out.println("");
        }

        System.out.println("\n");
        k = 1;

        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= k; i++) {
                System.out.print(j + " ");
            }
            k++;
            System.out.println("");
        }

        System.out.println("\n");
        k = 1;

        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= k; i++) {
                if (l <= n){
                    System.out.print(l + " ");
                    l++;
                }
            }
            k++;
            System.out.println("");
        }

    }
}
