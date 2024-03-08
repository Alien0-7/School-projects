package switchEsempi;

import java.util.Scanner;

public class Es1 {
    public static void main(String[] args){
        /*
        switch (variabile){
            case valore1:
                operazioni...
                break;
            case valore2:
                operazioni...
                break;
            case valore3:
                operazioni...
                break;
            case valore4:
                operazioni...
                break;
            default:
                operazioni...

        }

        variabile di che tipo?
        intero,
        carattere (cod ASCII è un numero intero),
        boolean (non serve),
        String,
        numero decimale --> double **NO**

         */
        int lati;
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci i lati: "); lati = scan.nextInt();

        switch (lati){
            case 3:
                System.out.println("La forma geometrica con " + lati + " lati è un triangolo");

            case 4:
                System.out.println("La forma geometrica con " + lati + " lati è un quadrato");
                break;
            case 5:
                System.out.println("La forma geometrica con " + lati + " lati è un pentagono");
                break;
            case 6:
                System.out.println("La forma geometrica con " + lati + " lati è un esagono");
                break;
            default:
                System.out.println("Non riesco a calcolarlo...");
        }
    }
}
