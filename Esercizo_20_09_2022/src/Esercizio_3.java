import java.util.Scanner;

public class Esercizio_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dammi in input un numero e ti dirò la sua tabellina");
		int n = input.nextInt();
		int ris = 0;
		
		for (int i = 1; i <= 10; i++) {
				ris = n * i;
			System.out.println(ris);
		}
	}
}
