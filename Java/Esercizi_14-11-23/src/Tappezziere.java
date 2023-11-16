/*
 * Nome   : Elia Morari
 * Classe : 3AI
 * Data   : 14/11/23
 *
 * Repository : https://github.com/Alien0-7/School-projects/tree/main/Java/Esercizi_14-11-23
 *
 * Descrizione:
 * Un tappezziere deve fare un preventivo per una stanza. La stanza ha dimensioni 3m per 4,5 m, ed è alta 2,80 m. Ogni rotolo è lungo 10,05 m ed è alto 53 cm (dimensioni standard di un rotolo).
 * Sono possibili diverse soluzioni, con prezzi diversificati: la carta normale costa 24 €, quella extra costa 30 € e quella extra-fine 34 €. Calcolare il costo stimato per i tre casi.
 * Calcolare comunque un 30% in più di carta rispetto allo stretto necessario, per eventuali problemi e per riserva.
 *
 */
import java.util.Scanner;

public class Tappezziere {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double stanzaX = 3, stanzaY = 2.8, stanzaZ = 4.5, areaSoffitto = stanzaX * stanzaZ, areaMuro1 = stanzaX * stanzaY , areaMuro2 = stanzaZ * stanzaY, costo, areaTot= areaMuro1 * 2 + areaMuro2 * 2 + areaSoffitto, areaRotolo = 10.05 * 0.58;
        int carta = 0, rotoli = 0;
        boolean numeroValido = true;


        System.out.println("--------- Tipi di carta da parati ---------");
        System.out.println("Carta normale: costo 24€ al rotolo");
        System.out.println("Carta extra: costo 30€ al rotolo");
        System.out.println("Carta extra-fine: costo 34€ al rotolo");
        System.out.println("Inserisci 1 per carta normale, 2 per carta extra, 3 per carta extra-fine");
        System.out.println("-------------------------------------------");
        System.out.print("Inserire quale tipo di carta vuoi: ");
        carta = scan.nextInt();

        while (numeroValido) {
            switch (carta) {
                case 1:
                    rotoli = (int) areaTot / (int) areaRotolo ;
                    rotoli = rotoli + (int) Math.ceil((30 * rotoli) / 100);
                    costo = rotoli * 24;
                    System.out.println("l'area tot è " + areaTot + " metri quadri, il costo è " + costo + "€, i rotoli da coprare sono: " + rotoli + " (+ il 30% per eventuali problemi e per riserva)" );
                    numeroValido = false;
                    break;
                case 2:
                    rotoli = (int) areaTot / (int) areaRotolo ;
                    rotoli = rotoli + (int) Math.ceil((30 * rotoli) / 100);
                    costo = rotoli * 30;
                    System.out.println("l'area tot è " + areaTot + " metri quadri, il costo è " + costo + "€, i rotoli da coprare sono: " + rotoli + " (+ il 30% per eventuali problemi e per riserva)" );
                    numeroValido = false;
                    break;
                case 3:
                    rotoli = (int) areaTot / (int) areaRotolo ;
                    rotoli = rotoli + (int) Math.ceil((30 * rotoli) / 100);
                    costo = rotoli * 34;
                    System.out.println("l'area tot è " + areaTot + " metri quadri, il costo è " + costo + "€, i rotoli da coprare sono: " + rotoli + " (+ il 30% per eventuali problemi e per riserva)" );
                    numeroValido = false;
                    break;
                default:
                    System.out.print("Il numero inserito non è valido!\nReinserire il numero del tipo di carta: ");
                    numeroValido = true;
                    carta = scan.nextInt();

            }
        }
    }
}
