package aufgaben.aufgabe1;

public class Aufgabe1 {
	
	public static void printRhombus(int upperHalf, boolean filled) {
		if (upperHalf > 0) {
			if (filled) 
				printRhombusFilled(upperHalf);
			else 
				printRhombusUnfilled(upperHalf);
		}
	}
	
	public static void printRhombusFilled(int upperHalf) {
		
		// oberes Hälfte
		for (int i = 0; i < upperHalf; i++) {
			for (int j = i; j < upperHalf; j++) 
				System.out.print(" ");
			for (int k = 2*i+1; k > 0; k--) 
				System.out.print("*");
			System.out.println();
		}
		// mittlere Zeile
		for (int i = 2*upperHalf+1; i > 0; i--)
			System.out.print("*");
		System.out.println();
		
		// untere Hälfte
		for (int i = 0; i < upperHalf; i++) {
			for (int j = 1+i; j > 0; j--)
				System.out.print(" ");
			for (int k = 2*(upperHalf-1-i)+1; k > 0; k--)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public static void printRhombusUnfilled(int upperhalf) {
		
		// oberes Hälfte
		for (int i = 0; i < upperhalf; i++) {
			for (int j = i; j < upperhalf; j++)
				System.out.print(" ");
			System.out.print("*");
			if (i != 0) {
				for (int k = 2*(i-1)+1; k > 0; k--)
					System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}
		// mittlere Zeile
		System.out.print("*");
		for (int i = 2*upperhalf-1; i > 0; i--)
			System.out.print(" ");
		System.out.println("*");
		
		// untere Hälfte
		for (int i = 0; i < upperhalf; i++) {
			for (int j = 1+i; j > 0; j--)
				System.out.print(" ");
			System.out.print("*");
			if (i != upperhalf-1) {
				for (int k = 2*(upperhalf-1-i)-1; k > 0; k--)
					System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		printRhombus(3, true);
		printRhombus(3, false);
	}
}
