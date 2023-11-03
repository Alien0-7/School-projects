/*
 * Nome   : Elia Morari
 * Classe : 3AI
 * Data   : 02/11/23
 * 
 * Repository : https://github.com/Alien0-7/School-projects/tree/main/Java/Esercizi_03-11-23
 *
 * Descrizione
 * Visualizzare la tabellina del numero n inserito dall'input
 * e controllare se n è un valore non valido (maggiore di 10 o minore di 1)
 * 
 */
import java.util.Scanner;

public class Tabellina {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int n; //Numero che viene visualizzata la sua tabellina
        int i; //Contatore ciclo FOR

        System.out.print("Inserisci un numero per visualizzare la sua tanellina: ");
        n = keyboard.nextInt();

        while (n > 10 || n < 1) {
        	System.out.println("Numero non valido!");
        	System.out.print("Reinserire il numero: ");
        	n = keyboard.nextInt();
        }

        for (i = 1; i <= 10; i++) {
            System.out.println( n + " x " + i + " = " + n*i);
        }

    }
}
