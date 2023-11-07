/*
 * Nome   : Elia Morari
 * Classe : 3AI
 * Data   : 07/11/23
 *
 * Repository : https://github.com/Alien0-7/School-projects/tree/main/Java/Esercizi_10-11-23
 *
 * Descrizione:
 * Visualizzare 100 numeri casuali compresi tra 1 e 10.
 * Al termine determinare la media.
 *
 */
package Random;

import java.util.Random;

public class Esercizio2 {

    public static void main(String[] args){
        int num;
        double media = 0;
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            num = random.nextInt(10) + 1;
            media = media + num;
            System.out.println("Il numero random è " + num);
        }
        media = media / 100;
        System.out.println("La media dei 100 numeri è " + media);
    }
}
