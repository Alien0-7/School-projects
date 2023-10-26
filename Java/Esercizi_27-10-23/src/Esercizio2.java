/*
	Elia Morari 3AI
	Esercizi 27/10/23
	Repository project https://github.com/Alien0-7/School-projects

 */

import java.util.Scanner;

public class Esercizio2 {

	/*
		Inserimento di un numero per ordinare un panino
		controllando che il numero sia giusto
	 */

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		int panino;
		double soldiInseriti;
		double resto ;
		
		System.out.println("Inserire quale panino si desidera (1=prosciutto, 2=pancetta):");
		panino = tastiera.nextInt();
		
		while (panino != 1 && panino != 2) {
			System.out.println("Questo non é un valore valido!");
			System.out.println("Reinserire il valore:");
			panino = tastiera.nextInt();
		}
		if (panino == 1) {
			System.out.println("Hai selezionato il panino al proscitto, devi pagare 1,50 euro");
			System.out.println("Quanti soldi inserisci?");
			soldiInseriti = tastiera.nextDouble();
			resto = soldiInseriti - 1.5;
			System.out.println("Il resto é di " + resto + " euro");
		} else {
			System.out.println("Hai selezionato il panino alla pancetta, devi pagare 2 euro");
			System.out.println("Quanti soldi inserisci?");
			soldiInseriti = tastiera.nextDouble();
			resto = soldiInseriti - 2;
			System.out.println("Il resto é di " + resto + " euro");
		}

	}

}
