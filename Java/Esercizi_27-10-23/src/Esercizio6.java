import java.util.Scanner;

public class Esercizio6 {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		int anno;

		System.out.println("Inserisci l'anno:");
		anno = tastiera.nextInt();
		while (anno <= 0) {
			System.out.println("Valore non corretto!");
			System.out.println("Reinserire l'anno:");
			anno = tastiera.nextInt();
		}

		if ( anno % 4 == 0 ) { // % serve per vedere se il resto è 0
			if (anno % 100 == 0) {
				if (anno % 400 == 0) {
					System.out.println("anno bisestile");
				} else {
					System.out.println("anno non bisestile");
				}
			} else {
				System.out.println("anno bisestile");
			}

		} else {
			System.out.println("anno non bisestile");
		}

	}

	// L'anno 2024 è bisestile

}
