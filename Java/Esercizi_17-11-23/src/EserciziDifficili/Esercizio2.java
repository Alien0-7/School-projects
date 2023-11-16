package EserciziDifficili;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int n;                //Numero input
        int count = 1;        //Numero che serve per il ciclo for
        int nSubtracted = 1;  //Numero che tiene conto dei numeri dispari sommati
        int rad = 0;          // Numero che tiene conto della somma

        System.out.print("Inserire un numero per visualizzare se è un quadrato perfetto: ");
        n = keyboard.nextInt();

        while (n <= 0) {
            System.out.println("Il numero inserito non è valido!");
            System.out.print("Reinserire il numero: ");
            n = keyboard.nextInt();
        }
        if (n == 1 ) {
            rad = 1;
        } else {
            while(count <= 0){
                if (nSubtracted % 2 != 0) {
                    count = count - nSubtracted;
                }
                nSubtracted++;
            }

            if (count == 0){
                System.out.println("Il numero inserito è una radice intera\nLa radice quadrata di " + n + " è: " + rad);
            } else if (count < 0) {
                System.out.println("Il numero inserito non è una radice intera");
            }
        }
    }
}
