/*
 * Nome   : Elia Morari
 * Classe : 3AI
 * Data   : 06/11/23
 *
 * Repository : https://github.com/Alien0-7/School-projects/tree/main/Java/Esercizi_10-11-23
 *
 * Descrizione:
 * Visualizzare numeri pari da 1 a 100
 *
 */

package CicliFOR;

public class Esercizio2 {
    public static void main(String[] args){

        for(int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.print(i + "  ");
            }
        }
    }
}
