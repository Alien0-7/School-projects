/*
 * Nome   : Elia Morari
 * Classe : 3AI
 * Data   : 03/11/23
 *
 * Repository : https://github.com/Alien0-7/School-projects/tree/main/Java/Esercizi_04-11-23
 *
 * Descrizione
 * Calcolare il quadrato di un numero n
 * sommando n numeri dispari
 *
 */
import java.util.Scanner;

public class QuadratoN {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int n;             //Numero input
        int count = 1;     //Numero che serve per il ciclo for
        int nOdd = 0;      //Numero che tiene conto dei numeri dispari sommati
        int tot = 0;       // Numero che tiene conto della somma

        System.out.print("Inserire un numero per visualizzare il suo quadrato: ");
        n = keyboard.nextInt();

        while (n <= 0) {
            System.out.println("Il numero inserito non è valido!");
            System.out.print("Reinserire il numero: ");
            n = keyboard.nextInt();
        }
        if (n == 1 ) { // se n è = a 1
            tot = 1;      // allora il totale è 1
        } else {       // se no
            while (n > nOdd) { //finché l'input è maggiore dei numeri dispari sommati al totale

                if (count % 2 != 0) { // se il contatore che aumenta ogni volta di 1 è non divisibile per 2
                    //System.out.println("tot = count: " + count + " + tot: " + tot); //usato in fase di debug del codice
                    tot = count + tot; // allora sommi al totale il contatore
                    nOdd++; // variabile che incrementa di 1 se è stato sommato un numero dispari
                }
                count++; // variabile che incrementa di 1 per sommare al totale solo i numeri dispari
            }
        }

        System.out.println("Il quadrato di " + n + " è: " + tot);

    }
}
