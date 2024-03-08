package Tris;

import java.util.Scanner;

public class Tris {
    public static void main(String[] args) {

        String[][] tris = new String[3][3];
        boolean conferma = false, casellaCorretta = false, fine = false, VittoriaU1 = false;
        String confermaStringa, segno2 = "", segno1 = "", nome1 = "", nome2 = "", casella;
        Scanner scan = new Scanner(System.in);
        int turno = 2; //2 perché so che è un numero divisibile per 2 (non metto 0 perché se no dovrei fare ulteriori controlli)

        System.out.println("---------- TRIS ----------");
        while (!conferma) {

            //INSERIMENTO DEI DATI
            System.out.println("UTENTE 1:");

            System.out.print("  Inserisci il nome: ");
            nome1 = scan.nextLine();

            System.out.print("  Inserisci il segno (X oppure O):");
            segno1 = scan.nextLine().toUpperCase();

            while (!(segno1.equalsIgnoreCase("X")) && !(segno1.equalsIgnoreCase("O"))) {
                System.out.print("  Valore non corretto!\n  Reinserisci scrivendo X oppure O:");
                segno1 = scan.nextLine().toUpperCase();
            }
            if (segno1.equals("X"))
                segno2 = "O";
            else
                segno2 = "X";

            System.out.print("UTENTE 2:\n  Inserisci il nome: ");
            nome2 = scan.nextLine();
            while (nome2.equals(nome1)) {
                System.out.print("  Nome identico al primo!\n  Reinserisci il nome: ");
                nome2 = scan.nextLine();
            }

            System.out.print("\n--- INFORMAZIONI --- \nUTENTE 1: nome:" + nome1 + " segno:" + segno1);
            System.out.print("\nUTENTE 2: nome:" + nome2 + " segno:" + segno2);
            System.out.print("\nè corretto? (Si/No) ");
            confermaStringa = scan.nextLine();
            if (confermaStringa.equalsIgnoreCase("Si"))
                conferma = true;
        }

        System.out.print("\nGIOCHIAMO!\n");
        System.out.print("Regole: A turno, i giocatori scelgolo una cella vuota e vi disegnano il proprio simbolo.\n" +
                         "Vince il giocatore che riesce a disporre tre dei propri simboli in linea retta orizzontale, verticale o diagonale.\n" +
                         "Se la tabella viene riempita senza che nessuno dei giocatori vinca il gioco finisce in parità");


        //RIEMPIMENTO DELLA TABELLA
        for (int i = 0; i < tris.length; i++) { //Scorrimento delle righe della matrice

            for (int j = 0; j < tris[i].length; j++) { //Scorrimento delle colonne della riga della matrice
                tris[i][j] = " ";
            }

        }

        while (!fine) {
            int colonna = -1, riga = -1;

            //STAMPA DELLA TABELLA
            System.out.printf("%13s", "\n    1   2   3\n\n");
            for (int i = 0; i < tris.length; i++) {
                System.out.printf("%1s", (char) (65 + i));
                System.out.printf("%13s", "   " + tris[i][0] + " | " + tris[i][1] + " | " + tris[i][2] + "\n");
                if (i != tris.length - 1)
                    System.out.printf("%13s", "   ---+---+---\n");
            }

            //INSERIMENTO DEL SEGNO NELLA TABELLA
            if (turno % 2 == 0) {
                System.out.print("\nÈ il turno di " + nome1 + ", scrivi dove vuoi mettere la " + segno1 + ": ");
                casella = scan.nextLine();
            } else {
                System.out.print("\nÈ il turno di " + nome2 + ", scrivi dove vuoi mettere la " + segno2 + ": ");
                casella = scan.nextLine();
            }

            //VALORE CASELLA CORRETTO + INSERITA NELLA TABELLA
            while (!casellaCorretta) {
                if (casella.length() == 2) {
                    switch (casella.charAt(0)) {
                        case 'A':
                            riga = 0;
                            break;
                        case 'B':
                            riga = 1;
                            break;
                        case 'C':
                            riga = 2;
                            break;
                        default:
                            System.out.print("Valore della casella non corretta!\nReinserisci il valore della casella: ");
                            casella = scan.nextLine();
                            break;
                    }

                    switch (casella.charAt(1)) {
                        case '1':
                            colonna = 0;
                            break;
                        case '2':
                            colonna = 1;
                            break;
                        case '3':
                            colonna = 2;
                            break;
                        default:
                            System.out.print("Valore della casella non corretta!\nReinserisci il valore della casella: ");
                            casella = scan.nextLine();
                            break;
                    }

                    //controllo casella piena
                    if (colonna != -1 && riga != -1) {

                        if (!tris[riga][colonna].equals(" ")) {
                            System.out.print("La casella è già occupata!\nReinserisci la casella: ");
                            casella = scan.nextLine();

                        } else {

                            //Inserimento nella tabella
                            if (turno % 2 == 0)
                                tris[riga][colonna] = "X";
                            else
                                tris[riga][colonna] = "O";

                            casellaCorretta = true;
                        }
                    }
                } else {
                    System.out.print("La casella non esiste!\nReinserisci la casella: ");
                    casella = scan.nextLine();
                }
            }
            casellaCorretta = false;

            //CONTROLLO VITTORIA solo se si ha già inserito come minimo 3 X
            if (turno >= 6 && turno <= 10) {
                //System.out.print("Da adesso puoi vincere!");
                for (int i = 0; i < tris.length; i++) {
                    if (tris[i][0].equals(segno1) && tris[i][1].equals(segno1) && tris[i][2].equals(segno1)) { //Caso segno uguale in una riga
                        VittoriaU1 = true;
                        fine = true;
                        break;
                    } else if (tris[0][i].equals(segno1) && tris[1][i].equals(segno1) && tris[2][i].equals(segno1)) { //Caso segno uguale colonna
                        VittoriaU1 = true;
                        fine = true;
                        break;
                    } else if (tris[0][0].equals(segno1) && tris[1][1].equals(segno1) && tris[2][2].equals(segno1)) {
                        VittoriaU1 = true;
                        fine = true;
                        break;
                    } else if (tris[0][2].equals(segno1) && tris[1][1].equals(segno1) && tris[2][0].equals(segno1)) {
                        VittoriaU1 = true;
                        fine = true;
                        break;
                    } else if (tris[i][0].equals(segno2) && tris[i][1].equals(segno2) && tris[i][2].equals(segno2)) { //Caso con l'altro segno in riga
                        VittoriaU1 = false;
                        fine = true;
                        break;
                    } else if (tris[0][i].equals(segno2) && tris[1][i].equals(segno2) && tris[2][i].equals(segno2)) { //Caso con l'altro segno in colonna
                        VittoriaU1 = false;
                        fine = true;
                        break;
                    } else if (tris[0][0].equals(segno2) && tris[1][1].equals(segno2) && tris[2][2].equals(segno2)) { //Caso con l'altro segno in obliquo
                        VittoriaU1 = false;
                        fine = true;
                        break;
                    } else if (tris[0][2].equals(segno2) && tris[1][1].equals(segno2) && tris[2][0].equals(segno2)) { //Caso con l'altro segno in obliquo
                        VittoriaU1 = false;
                        fine = true;
                        break;
                    }
                }

            } else if (turno == 10) {
                fine = true;
                break;
            }

            turno++;
        }

        //ULTIMA STAMPA DELLA TABELLA
        System.out.printf("%13s", "\n    1   2   3\n\n");
        for (int i = 0; i < tris.length; i++) {
            System.out.printf("%1s", (char) (65 + i));
            System.out.printf("%13s", "   " + tris[i][0] + " | " + tris[i][1] + " | " + tris[i][2] + "\n");
            if (i != tris.length - 1)
                System.out.printf("%13s", "   ---+---+---\n");
        }

        if (VittoriaU1)
            System.out.print("\n" + nome1 + " Ha vinto!");
        else if (turno > 10)
            System.out.print("\nParità!");
        else
            System.out.print("\n" + nome2 + " Ha vinto!");

    }
}