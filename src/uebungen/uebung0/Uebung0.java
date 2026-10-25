package uebungen.uebung0;

public class Uebung0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Uebung 0");
		
		int n = 53;
		int anzahl = 0;
		while (n != 1) {
			if (n % 2 != 0) {
				n = 3*n+1;
				anzahl ++;
			}
			else {
				n = n/2;
				anzahl ++;
			}
		}
		System.out.println(n);
		System.out.println(anzahl);
		
		// der euklidsche Algorithmus (ggT)
		int a = 42;
		int b = 24;
		anzahl = 0;
		while (a != b) {
			if (a < b) {
				b = b - a;
				anzahl++;
			}
			else {
				a = a - b;
				anzahl++;
			}
		}
		System.out.println("Der ggT ist: " + a);
		System.out.println(anzahl);
		
		int jahr = 1900;
		if (jahr % 4 == 0) {
			if (jahr % 100 == 0) {
				if (jahr % 400 == 0)
					System.out.println("Das Jahr " + jahr + " ist ein Schaltjahr");
				else
					System.out.println("Das Jahr " + jahr + " ist kein Schaltjahr");
			}
			else
				System.out.println("Das Jahr " + jahr + " ist ein Schaltjahr");
		}
		else
			System.out.println("Das Jahr " + jahr + " ist kein Schaltjahr");
	}  

}
