/*
	Elia Morari 3AI
	Esercizi 27/10/23
	Repository project https://github.com/Alien0-7/School-projects

 */

import java.util.Scanner;

public class Esercizio3 {

	/*
		Calcolare il costo di trasporto delle valigie
		controllando che il peso non sia uguale o minore di 0
	 */

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		double peso;
		double costo = 10;
		
		System.out.println("Inserire il peso della valigia:");
		peso = tastiera.nextDouble();

		while (peso <= 0) {
			System.out.println("Valore non corretto!");
			System.out.println("Reinserire il voto");
			peso = tastiera.nextInt();
		}

		if (peso <= 10) {
			System.out.println("Il costo del trasporto é di " + costo + " euro");
		} else {
			costo = costo + 2 * (peso - 10);
			System.out.println("Il costo del trasporto é di " + costo + " euro");
		}
	}

}
