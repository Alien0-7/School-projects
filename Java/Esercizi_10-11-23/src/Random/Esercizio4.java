/*
 * Nome   : Elia Morari
 * Classe : 3AI
 * Data   : 07/11/23
 *
 * Repository : https://github.com/Alien0-7/School-projects/tree/main/Java/Esercizi_10-11-23
 *
 * Descrizione:
 * Visualizzare numeri casuali compresi tra -10 e +10 finchè non si visualizza il numero 0:
 * al termine dire quanti numeri sono stati visualizzati
 *
 */
package Random;

import java.util.Random;

public class Esercizio4 {

    public static void main(String[] args){
        int num, numVisualized = 0;
        Random random = new Random();

        do {
            num = random.nextInt(21) -10;
            System.out.println("Il numero random è " + num);
            numVisualized++;
        } while (num != 0);

        System.out.println("\nSono stati visualizzati " + numVisualized + " numero/i random");
    }
}
