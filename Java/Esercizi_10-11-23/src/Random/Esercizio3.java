/*
 * Nome   : Elia Morari
 * Classe : 3AI
 * Data   : 07/11/23
 *
 * Repository : https://github.com/Alien0-7/School-projects/tree/main/Java/Esercizi_10-11-23
 *
 * Descrizione:
 * Visualizzare 40 numeri casuali compresi tra -10 e +10.
 * Determinare quante volte è stato generato il numero 5.
 *
 */
package Random;

import java.util.Random;

public class Esercizio3 {

    public static void main(String[] args){
        int num, num5 = 0;
        Random random = new Random();

        for (int i = 0; i < 40; i++) {
            num = random.nextInt(21) -10;
            System.out.println("Il numero random è " + num);
            if (num == 5){
                num5++;
            }
        }

        System.out.println("\nIl numero 5 è uscito " + num5 + " volta/e");
    }
}
