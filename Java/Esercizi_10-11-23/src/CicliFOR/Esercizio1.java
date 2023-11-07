/*
 * Nome   : Elia Morari
 * Classe : 3AI
 * Data   : 06/11/23
 *
 * Repository : https://github.com/Alien0-7/School-projects/tree/main/Java/Esercizi_10-11-23
 *
 * Descrizione:
 * Visualizzare numeri da 1 a 10
 * e poi da 10 a 1
 *
 */

package CicliFOR;

public class Esercizio1 {
    public static void main(String[] args){

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "  ");
        }
        System.out.println("");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + "  ");
        }
    }
}
