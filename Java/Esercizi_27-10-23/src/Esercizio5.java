import java.util.Scanner;

public class Esercizio5 {

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
