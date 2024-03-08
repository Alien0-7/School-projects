package MetodiStatici;

import java.util.Scanner;

public class Calcolatrice {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double n1,n2;
        String s1;
        boolean reinserisci;

        System.out.print("Inserisci il primo numero: ");
        n1 = scan.nextDouble();
        System.out.print("Inserisci il secondo numero: ");
        n2 = scan.nextDouble();

        scan.nextLine();

        System.out.print("Inserisci se vuoi sommare, sottrarre, moltiplicare o dividere: ");
        s1 = scan.nextLine().toLowerCase();

        do {
            reinserisci = false;

            switch (s1) {
                case "sommare":
                    System.out.print("La divisione tra " + n1 + " e " + n2 + " è " + somma(n1,n2));
                    break;
                case "sottrarre":
                    System.out.print("La divisione tra " + n1 + " e " + n2 + " è " + sottrazione(n1,n2));
                    break;
                case "moltiplicare":
                    System.out.print("La divisione tra " + n1 + " e " + n2 + " è " + moltiplicazione(n1,n2));
                    break;
                case "dividere":
                    if (n2 == 0) {
                        System.out.print("La divisione tra " + n1 + " e " + n2 + " è indefinita");
                    } else {
                        System.out.print("La divisione tra " + n1 + " e " + n2 + " è " + divisione(n1,n2));
                    }
                    break;
                default:
                    System.out.print("Valore non corretto!\nReinserisci se vuoi sommare, sottrarre, moltiplicare o dividere: ");
                    s1 = scan.nextLine().toLowerCase();
                    reinserisci = true;
                    break;
            }

        } while (reinserisci);

    }

    public static double somma(double x, double y){
        return x + y;
    }
    public static double sottrazione(double x, double y){
        return x - y;
    }
    public static double moltiplicazione(double x, double y){
        return x * y;
    }
    public static double divisione(double x, double y){
        return x / y;
    }

}
