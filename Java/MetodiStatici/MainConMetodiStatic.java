package MetodiStatici;

import java.util.Scanner;

public class MainConMetodiStatic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double altezza, base;

        System.out.print("Inserisci la base del rettangolo: ");
        base = scan.nextInt();

        System.out.print("Inserisci l'altezza del rettangolo: ");
        altezza = scan.nextInt();

        System.out.print("\nL'area del rettangolo è: " + CalcolaArea(base, altezza));

        System.out.print("\nIl perimetro del rettangolo è: " + CalcolaPerimetro(base, altezza));
    }

    static double CalcolaArea(double base, double altezza) {return base * altezza;}

    static double CalcolaPerimetro(double base, double altezza) {return (base + altezza) * 2;}

}
