package SlotMachine;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scan = new Scanner(System.in);
        String invio;
        int monete = 10, coppie = 0;
        int[] slot = new int[3];
        boolean fine = false, jackpot = true;


        while (!fine) {

            if (monete >= 1) {
                System.out.print("\nHai " + monete + " monete. Premi invio per generare dei nuovi numeri casuali");
                invio = scan.nextLine();
                monete--;
            } else {
                System.out.print("\nHai 0 monete. Hai perso!");
                break;
            }

            //RIEMPIMENTO CON NUMERI CASUALI LA SLOT
            for (int i = 0; i < slot.length; i++) {
                slot[i] = r.nextInt(5) + 1;
            }

            //STAMPA DELLA SLOT
            for (int i = 0; i < slot.length; i++) {
                System.out.print("+----+");
            }
            System.out.println();
            for (int i = 0; i < slot.length; i++) {
                if (slot[i] < 10)
                    System.out.print("| 0" + slot[i] + " |");
                else
                    System.out.print("| " + slot[i] + " |");
            }
            System.out.println();
            for (int i = 0; i < slot.length; i++) {
                System.out.print("+----+");
            }
            System.out.println();

            //CONTROLLO VINCITA COPPIE
            for (int i = 0; i < slot.length; i++) {
                for (int j = slot.length - 1; j > i; j--) {
                    if (slot[i] == slot[j]) {
                        coppie++;
                        break;
                    }
                }
            }

            //CONTROLLO VINCITA JACKPOT
            for (int i = 1; i < slot.length; i++) {
                if (slot[i] != slot[0]) {
                    jackpot = false;
                    break;
                }
            }

            System.out.println();

            if (jackpot) {
                monete = 100;
                System.out.print("Hai fatto JACKPOT!!!");
                fine = true;

            } else if (coppie >= 1) {

                while (coppie > 0) {
                    if (monete <= 97) {
                        monete += 3;
                        System.out.print("Hai fatto una coppia. Hai vinto 3 monete!");

                    } else {
                        System.out.print("Hai raggiunto il massimo di monete. Hai vinto!");
                        fine = true;
                    }
                    coppie--;
                }

            } else System.out.print("Non hai vinto niente.");

            jackpot = true;
            coppie = 0;

        }

    }
}
