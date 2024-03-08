package Matrici;

import java.util.Random;

public class Es1 {
    public static void main(String[] args) {
        Random r = new Random();
        final int NR = 3;//Numero righe
        final int NC = 3;//Numero colonne
        int matrice[][] = new int[NR][NC];

        for (int i = 0; i < NR; i++) {
            for (int j = 0; j < NC; j++) {
                matrice[i][j] = r.nextInt(10);
            }

        }

        System.out.println("+-------------------+");
        for (int i = 0; i < NR; i++) {
            System.out.print("| " + i + " | ");
            for (int j = 0; j < NC; j++) {
                System.out.print(matrice[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.print("+-------------------+\n");

        for (int i = 0; i < NR; i++) {
            System.out.print("| " + i + " | ");
            for (int j = 0; j < NC; j++) {
                System.out.print(i + "" + j + " | ");
            }
            System.out.println();
        }
    }
}
