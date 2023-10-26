/*
	Elia Morari 3AI
	Esercizi 27/10/23
	Repository project https://github.com/Alien0-7/School-projects

 */

import java.util.Scanner;

public class Esercizio5 {

	/*
		Inserimento dell'età per visualizzare il costo del biglietto del treno Milano-Roma
		in base allo sconto applicato per l'età
	 */

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		int eta;
		double biglietto = 72;

		System.out.println("Inserisci l'età:");
		eta = tastiera.nextInt();
		
		if (eta > 70) {
			
			biglietto = biglietto - (biglietto*50/100);
			System.out.println("Devi pagare il prezzo -50%: " + biglietto + " euro");
			
		} else if (eta < 4){
			
			System.out.println("Non devi pagare");
			
		} else if (eta < 12){
			
			biglietto = biglietto - (biglietto*30/100);
			System.out.println("Devi pagare il prezzo -30%: " + biglietto + " euro");
		} else {
			
			System.out.println("Devi pagare il prezzo pieno: " + biglietto + " euro");
		}
		
	}

}
