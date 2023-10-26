import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserire il valore di a dell'equazione");		
		double a = tastiera.nextDouble();
		System.out.println("Inserire il valore di b dell'espressione");
		double b = tastiera.nextDouble();
		double x;
		
		if (a == 0) {
			System.out.println("L'espressione é impossibile!");
		} else if  (b == 0) {
			System.out.println("L'espressione é indeterminata!");
		} else {
			x = (-b)/a;
			System.out.println("Il valore di x é " + x);
		}
		
			
		
		

	}

}
