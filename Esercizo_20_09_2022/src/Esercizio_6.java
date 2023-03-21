
public class Esercizio_6 {
	public static void main(String[] args) {
		for(int i = 1; i <= 6; i++) {
			for(int x = 1; x <= i; x++) {
				System.out.print(x);
			}
			System.out.print("   ");
			for(int m = 7-i; m >= 1; m--) {
				System.out.print(m);				
			}
			System.out.print("\n");
		}
	}
	
}
