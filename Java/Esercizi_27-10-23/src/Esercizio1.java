/*
	Elia Morari 3AI
	Esercizi 27/10/23
	Repository project https://github.com/Alien0-7/School-projects

 */

import java.util.Scanner;

public class Esercizio1 {

	/*
		Risoluzione di un'equazione di primo grado
		stando attenti ai casi specifici
	 */

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserire il valore di a dell'equazione");		
		double a = tastiera.nextDouble();
		System.out.println("Inserire il valore di b dell'espressione");
		double b = tastiera.nextDouble();
		double x;
		
		if (a == 0 || b == 0) {
			System.out.println("L'espressione é indeterminata!");
		} else if  (a == 0) {
			System.out.println("L'espressione é impossibile!");
		} else {
			x = (-b)/a;
			System.out.println("Il valore di x é " + x);
		}
		
			
		
		

	}

}
