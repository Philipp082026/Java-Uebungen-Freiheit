package uebungen.uebung3;

public class FibonacciFolge {
	
	public static void fibonacci(int n) {
		
		int n_1 = 0;
		int n_2 = 1;
		int hilfswert = 0;
		
		for (int i = 1; i <= n; i++) {
			
			String summanden = "";
			
			if (n_1 > n_2) {
				hilfswert = n_1;
				n_1 = n_2;
				n_2 = hilfswert;
			}
			summanden = summanden + n_1 + " + " + n_2 + " = ";	
			n_1 = n_1 + n_2;
			
			System.out.println(summanden + n_1);
		}
	}

	public static void main(String[] args) {
		
		fibonacci(7);
	}

}
