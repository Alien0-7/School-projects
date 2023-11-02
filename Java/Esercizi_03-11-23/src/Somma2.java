/*
 * Nome   : Elia Morari
 * Classe : 3AI
 * Data   : 02/11/23
 * 
 * Repository : https://github.com/Alien0-7/School-projects/tree/main/Java/Esercizi_03-11-23
 *
 * Descrizione
 * Calcolare la somma tra 1 e n inserito dall'input
 *
 * 
 */
import java.util.Scanner;

public class Somma2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int n; //Numero finale del ciclo FOR
        int count; //Contatore ciclo FOR
        int somma = 0; //Somma tra 1 e n

        System.out.print("Inserire il numero per calcolare la somma tra 1 e il numero: ");
        n = keyboard.nextInt();

        while (n <= 0) {
            System.out.println("Il numero inserito non è valido!");
            System.out.print("Reinserire il numero: ");
            n = keyboard.nextInt();
        }

        for (count = 1; count <= n; count++){
            somma = somma + count;

        }

        System.out.println("La somma tra 1 e " + n + " è " + somma);
    }
}