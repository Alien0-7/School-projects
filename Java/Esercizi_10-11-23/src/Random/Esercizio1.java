/*
 * Nome   : Elia Morari
 * Classe : 3AI
 * Data   : 07/11/23
 *
 * Repository : https://github.com/Alien0-7/School-projects/tree/main/Java/Esercizi_10-11-23
 *
 * Descrizione:
 * Simulare 100 volte il lancio di un dado e determinare quante volte è uscito il numero 6
 *
 */
package Random;

import java.util.Random;

public class Esercizio1 {
    public static void main(String[] args){
        int dado, dado6 = 0;
        Random random = new Random();

        for (int i = 0; i < 100; i++){
            dado = random.nextInt(6)+1;

            if (dado == 6){
                dado6++;
            }
            System.out.println("è uscito il numero " + dado);
        }

        System.out.println("\nIl numero 6 è uscito " + dado6 + " volta/e");
    }
}
