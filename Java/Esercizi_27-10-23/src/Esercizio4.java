/*
	Elia Morari 3AI
	Esercizi 27/10/23
	Repository project https://github.com/Alien0-7/School-projects

 */

import java.util.Scanner;

public class Esercizio4 {

	/*
		inserimento di un voto con semplice giudizio
	 */

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		int voto;
		
		
		System.out.println("Inserire il voto");		
		voto = tastiera.nextInt();
		
		while (voto < 1 || voto > 10) {
			System.out.println("Valore non corretto!");
			System.out.println("Reinserire il voto");
			voto = tastiera.nextInt();
		}
		if (voto >= 6) {
			System.out.println("LA PROVA È SUFFICIENTE");
		} else if (voto >= 4) {
			System.out.println("LA PROVA È INSUFFICIENTE");
		} else {
			System.out.println("LA PROVA È GRAVEMENTE INSUFFICIENTE");
		}
	}

}
