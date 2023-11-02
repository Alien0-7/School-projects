/*
 * Nome   : Elia Morari
 * Classe : 3AI
 * Data   : 02/11/23
 * 
 * Repository : https://github.com/Alien0-7/School-projects/tree/main/Java/Esercizi_03-11-23
 *
 * Descrizione
 * Sommare un numero n inserito dall'input 
 * finché non si ottiene la somma maggiore di 20
 *
 */
import java.util.Scanner;

public class Somma1 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        double n; //Numero che si somma
        double somma; //Numero che tiene memoria della somma
        int count; //Numero che tiene memoria di quanti numeri sono stati inseriti nell'input

        System.out.print("Inserire il primo numero: ");
        n = keyboard.nextInt();
        somma = n;
        count = 1;

        while (somma <= 20 ) {
            System.out.print("Inserire un'altro numero: ");
            n = keyboard.nextInt();
            somma = somma + n;
            count++;
        }

        System.out.println("Sono stati inseriti " + count + " numeri");

    }
}
