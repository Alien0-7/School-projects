import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		double peso;
		double costo = 10;
		
		System.out.println("Inserire il peso della valigia:");
		peso = tastiera.nextDouble();
		if (peso <= 10) {
			System.out.println("Il costo del trasporto é di " + costo + " euro");
		} else {
			costo = costo + 2 * (peso - 10);
			System.out.println("Il costo del trasporto é di " + costo + " euro");
		}
	}

}
